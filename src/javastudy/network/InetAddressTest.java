/**
 * @author Nandi Zhou
 * 2015年5月6日
 * 
 */
package javastudy.network;

import java.net.InetAddress;

public class InetAddressTest {

	public static void main(String[] args) throws Exception {

		InetAddress address = InetAddress.getLocalHost();
		
		System.out.println(address);
		
		System.out.println(InetAddress.getByName("localhost"));
	}
}
