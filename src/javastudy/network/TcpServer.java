/**
 * @author Nandi Zhou
 * 2015年5月7日
 * Socket  Server端
 */
package javastudy.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) throws Exception {

		ServerSocket server = new ServerSocket(5000);
		Socket socket = server.accept();

		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		DataInputStream dis = new DataInputStream(socket.getInputStream());

		System.out.println(dis.readUTF() + " from Client");

		dos.writeUTF("welcome");

		dos.close();
		dis.close();
		server.close();
	}
}
