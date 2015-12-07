/**
 * @author Nandi Zhou
 * 2015Äê4ÔÂ23ÈÕ
 * 
 */
package javastudy.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StreamTest2 {

	public static void main(String[] args) throws Exception {

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		 String str;
		 
		 while (null != (str = br.readLine())) {
			System.out.println(str);
		}
		 
		 br.close();	
	}
}
