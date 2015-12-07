/**
 * @author Nandi Zhou
 * 2015��4��23��
 */
package javastudy.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StreamTest {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("list.txt");

		OutputStreamWriter osw = new OutputStreamWriter(fos);

		BufferedWriter bw = new BufferedWriter(osw);

		bw.write("www.google.com");
		bw.write("\r\n");
		bw.write("www.baidu.com");

		bw.close();

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("list.txt")));

		String str;

		while (null != (str = br.readLine())) {
			System.out.println(str);
		}

		br.close();
	}
}
