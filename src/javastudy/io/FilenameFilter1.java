/**
 * 
 */

package javastudy.io;

import java.io.File;
import java.io.FilenameFilter;

/**
 * FilenameFilterѧϰ
 * 
 * @author Nandi Zhou
 *
 */
public class FilenameFilter1 {
	
	public static void main(String[] args) {
		
		File f = new File("C:/Users/Administrator/Dropbox/Workshop/JavaStudy");
		
		String[] names = f.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				
				if (name.endsWith(".java")) { return true; }
				return false;
			}
		});
		
		if (names.length > 0) {
			
			for (String name : names) {
				System.out.println(name);
			}
		}
		else {
			System.out.println("no files in this direction");
		}
		
		System.exit(0);
		
	}
}
