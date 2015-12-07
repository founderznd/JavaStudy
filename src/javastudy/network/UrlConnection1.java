/**
 * @author Nandi Zhou
 * 2015年5月5日
 * 
 * 使用字节流的形式
 */
package javastudy.network;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class UrlConnection1 {

	public static void main(String[] args) throws Exception {

		URL url = new URL("http://www.infoq.com");

		//		URLConnection urlcon = url.openConnection();
		//		InputStream is = urlcon.getInputStream();

		InputStream is = url.openStream();

		OutputStream os = new FileOutputStream(new File("web.html"));

		byte[] buffer = new byte[2048];

		int len = 0;

		while (-1 != (len = is.read(buffer, 0, buffer.length))) {
			os.write(buffer, 0, len);
		}

		is.close();
		os.close();
	}
}
