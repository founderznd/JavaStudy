/**
 * 
 */
package javastudy.io;

import java.io.File;


/**
 * �о������ļ�
 * @author Nandi Zhou
 *
 */
public class FileTest3 {

	public static void main(String[] args) {

		File f = new File("c:/windows");
		
		for (String name : f.list()) {
			System.out.println(name);
		}
	}
}
