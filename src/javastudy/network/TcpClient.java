/**
 * @author Nandi Zhou
 * 2015年5月7日
 * Socket Client端
 */
package javastudy.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class TcpClient {

	public static void main(String[] args) throws Exception {

		Socket socket = new Socket("127.0.0.1", 5000);

		//为什么使用bufferedReader 和Writer  无法正常读取呢？？？
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		DataInputStream dis = new DataInputStream(socket.getInputStream());

		dos.writeUTF("hallo!!!!");

		System.out.printf("[%s]:%s", socket.getInetAddress().toString(), dis.readUTF());

		dos.close();
		dis.close();
		socket.close();
	}
}
