/**
 * ��������һ��Ŀ¼�������εķ�ʽչ�ֳ���Ŀ¼�е�������Ŀ¼���ļ���
 * ���⣬ͨ����˵��Ŀ¼�������棬�ļ��������档
 * ÿһ��Ҫ���ϵݽ�
 */
package javastudy.io;

import java.io.File;
import java.io.FileFilter;

/**
 * @author Nandi Zhou
 *
 */
public class ListAll {

	private static int deep = 0; //��¼�ݹ����

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

		File filePath = new File("G:/����");
		listAll(filePath);
	}
}
