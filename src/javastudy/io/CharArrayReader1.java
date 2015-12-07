/**
 * @author Nandi Zhou
 * 2015Äê4ÔÂ23ÈÕ
 * 
 */
package javastudy.io;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReader1 {

	public static void main(String[] args) throws IOException {

		String str = "abcdefg";

		char[] ch = new char[str.length()];

		str.getChars(0, str.length(), ch, 0);

		CharArrayReader car = new CharArrayReader(ch);

		char[] cbuf = new char[str.length()];
		car.read(cbuf);
		
		System.out.println(cbuf);

		car.close();
	}
}
