/**
 * @author Nandi Zhou
 * 2015年5月7日
 * UDP 传送
 */
package javastudy.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpServer {

	public static void main(String[] args) throws Exception {

		DatagramSocket ds = new DatagramSocket();

		String str = "hello world!!";
		DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), InetAddress.getByName("localhost"), 5436);

		ds.send(dp);

		byte[] buffer = new byte[1000];
		DatagramPacket dp2 = new DatagramPacket(buffer, 100);

		ds.receive(dp2);

		System.out.println(new String(buffer, 0, dp2.getLength()));
		ds.close();
	}
}
