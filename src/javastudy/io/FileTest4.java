/**
 * 
 */
package javastudy.io;

import java.io.File;
import java.io.FilenameFilter;

/**
 * ɾ������
 * 
 * @author Nandi Zhou
 *
 */
public class FileTest4 {

	public static void main(String[] args) {

		File f = new File("D:/Ѹ������/����ʳʬ��");
		for (File files : f.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {

				if (name.endsWith(".ass") || name.endsWith(".SMI")|| name.endsWith("ssa")) { return true; }
				return false;
			}
		})) {
			System.out.println(files.getName());
			files.delete();
		}

	}
}
