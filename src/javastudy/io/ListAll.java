/**
 * 给定任意一个目录，以树形的方式展现出该目录中的所有子目录和文件。
 * 另外，通常来说，目录排在上面，文件排在下面。
 * 每一层要加上递进
 */
package javastudy.io;

import java.io.File;
import java.io.FileFilter;

/**
 * @author Nandi Zhou
 *
 */
public class ListAll {

	private static int deep = 0; //记录递归深度

	public static void listAll(File file) {

		for (File f : file.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {

				if (pathname.isDirectory()) { return true; }
				return false;
			}
		})) {
			for (int i = 0; i < deep; i++) {
				System.out.print("\t");
			}
			System.out.println(f.getName() + " <DIR>");
			deep++;
			listAll(f);
			deep--;
		}

		for (File f : file.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {

				if (pathname.isFile()) { return true; }
				return false;
			}
		})) {
			for (int i = 0; i < deep; i++) {
				System.out.print("\t");
			}
			System.out.println(f.getName());
		}
	}

	public static void main(String[] args) {

		File filePath = new File("G:/动漫");
		listAll(filePath);
	}
}
