/**
 * @author Nandi Zhou
 * 2015Äê4ÔÂ23ÈÕ
 * 
 */
package javastudy.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	public static void main(String[] args) throws IOException {

		String str = new String("hello world welcome nihao hehe");

		FileWriter fw = new FileWriter("list2.txt");

		fw.write(str);

		fw.close();
	}
}
