/**
 * @author Nandi Zhou
 * 2015年5月7日
 * 
 */
package javastudy.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpClient {

	public static void main(String[] args) throws Exception {

		DatagramSocket socket = new DatagramSocket(5436);

		DatagramPacket dp1 = new DatagramPacket(new byte[1000], 1000);

		socket.receive(dp1);

		System.out.println(new String(dp1.getData(), 0, dp1.getLength()));

		String str = "welcome";

		DatagramPacket dp2 = new DatagramPacket(str.getBytes(), str.length(), dp1.getAddress(), dp1.getPort());

		socket.send(dp2);

		socket.close();
	}
}
