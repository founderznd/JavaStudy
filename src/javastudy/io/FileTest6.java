/**
 * 
 */
package javastudy.io;

import java.io.File;

/**
 * �õݹ�ɾ������Ŀ¼
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

		File f = new File("d:/test");
		delDir(f);
	}
}
