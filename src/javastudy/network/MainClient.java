/**
 * @author Nandi Zhou
 * 2015年5月7日
 * 
 */
package javastudy.network;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class MainClient {

	public static void main(String[] args) throws Exception {

		Socket socket = new Socket("127.0.0.1", 5547);

		new Thread(new ClientInputThread(socket)).start();
		new Thread(new ClientOutputThread(socket)).start();
	}
}

class ClientInputThread implements Runnable {

	private Socket socket;

	public ClientInputThread(Socket s) {

		this.socket = s;
	}

	@Override
	public synchronized void run() {

		try {
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			while (socket.isConnected()) {
				String str = dis.readUTF();
				System.out.println(str);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class ClientOutputThread implements Runnable {

	private Socket socket;

	public ClientOutputThread(Socket s) {

		this.socket = s;
	}

	@Override
	public void run() {

		while (socket.isConnected()) {
			try {
				/*
				 * readUTF貌似不能直接读取System.in
				 * 原因：readUTF expects a very specific length-prefixed format as written by DataOutputStream
				 * 解决：
				 * 用字符缓冲流BufferedReader代替
				 * 或者直接用Scanner也行，见MainServer
				 */
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
				BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
				String str = bis.readLine();
				dos.writeUTF("[Client]: " + str);
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}