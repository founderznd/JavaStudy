/**
 * @author Nandi Zhou
 * 2015年5月6日
 * 
 * 使用字符流的形式
 */
package javastudy.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlConnection2 {

	public static void main(String[] args) throws Exception {

		URL url = new URL("http://www.sina.com");

		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

		String line = null;

		while (null != (line = br.readLine())) {
			System.out.println(line);
		}

		br.close();
	}
}
