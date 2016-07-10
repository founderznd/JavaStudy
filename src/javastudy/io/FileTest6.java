/**
 * 
 */
package javastudy.io;

import java.io.File;

/**
 * 用递归删除整个目录
 * 
 * @author Nandi Zhou
 *
 */
public class FileTest6 {

	public static void delDir(File f) {

		if (f.isFile() || f.listFiles().length == 0) {
			f.delete();
		}
		else {
			File[] files = f.listFiles();
			for (File file : files) {
				delDir(file);
				file.delete();
			}
		}
		
		f.delete();

	}

	public static void main(String[] args) {

		File f = new File("C:/Users/Administrator/Desktop/test1 - 副本");
		delDir(f);
	}
}
