/**
 * @author Nandi Zhou
 * 2015Äê4ÔÂ22ÈÕ
 * 
 */
package javastudy.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamTest1 {

	public static void main(String[] args) throws Exception {

		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("list.txt"));

		bos.write("www.google.com".getBytes());

		bos.close();

	}
}
