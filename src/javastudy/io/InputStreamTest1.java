package javastudy.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Nandi Zhou
 * 
 * 
 */
public class InputStreamTest1 {

	public static void main(String[] args) throws IOException {

		InputStream is = new FileInputStream(new File("list.txt"));

		byte[] bytes = new byte[100];

		int len = 0;

		while ((len = is.read(bytes, 0, bytes.length)) != -1) {
			System.out.print(new String(bytes, 0, len));
		}
		
		is.close();
	}
}
