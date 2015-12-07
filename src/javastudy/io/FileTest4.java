/**
 * 
 */
package javastudy.io;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 删除操作
 * 
 * @author Nandi Zhou
 *
 */
public class FileTest4 {

	public static void main(String[] args) {

		File f = new File("D:/迅雷下载/东京食尸鬼");
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
