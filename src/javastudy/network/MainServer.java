/**
 * @author Nandi Zhou
 * 2015年5月7日
 * Thread 在 Socket 中的应用
 * 1:DataInputStream.readUTF()无法读取System.in流的问题
 * 2:如何管理多个客户端？？
 */
package javastudy.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class MainServer {

	private static ArrayList<Socket> clients = new ArrayList<Socket>();
	private static ServerSocket	  ss;
	private static final int		 port	= 5547;

	public static void main(String[] args) throws Exception {

		ss = new ServerSocket(port);

		while (true) {

			Socket socket = ss.accept();
			clients.add(socket);

			System.out.println("启动服务器线程");

			new Thread(new ServerInputThread(socket)).start();
			new Thread(new ServerOutputThread(clients)).start();
		}

	}
}

/*
 * 输入线程
 */
class ServerInputThread implements Runnable {

	private Socket socket;

	public ServerInputThread(Socket s) {

		this.socket = s;
	}

	@Override
	public void run() {

		try {
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			while (true) {
				String str = dis.readUTF();
				System.out.println(str);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/*
 * 输出线程
 */
class ServerOutputThread implements Runnable {

	private ArrayList<Socket> clients;
	private Socket			socket;

	public ServerOutputThread(Socket s) {

		this.socket = s;
		this.clients = new ArrayList<Socket>();
		clients.add(socket);
	}

	public ServerOutputThread(ArrayList<Socket> clients) {

		this.clients = clients;
		this.socket = null;
	}

	@Override
	public void run() {

		while (true) {
			try {
				@SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
				String str = scanner.nextLine();
				for (Socket socket : clients) {
					DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
					dos.writeUTF("[Server]: " + str);
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}