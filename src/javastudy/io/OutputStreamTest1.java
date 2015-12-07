package javastudy.io;

import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;

/**
 * 显示目录下的所有文件
 */
public class OutputStreamTest1 {

	private static int deep = 0; //

	public static void listAll(File file, FileOutputStream fos) throws Exception {

		for (File f : file.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {

				if (pathname.isDirectory()) { return true; }
				return false;
			}
		})) {
			StringBuffer output = new StringBuffer();
			for (int i = 0; i < deep; i++) {
				output.append("\t");
			}
			output.append(f.getName() + " <DIR>\r\n");
			fos.write(output.toString().getBytes());
			deep++;
			listAll(f, fos);
			deep--;
		}

		for (File f : file.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {

				if (pathname.isFile()) { return true; }
				return false;
			}
		})) {
			StringBuffer output = new StringBuffer();
			for (int i = 0; i < deep; i++) {
				output.append("\t");
			}
			output.append(f.getName() + "\r\n");
			fos.write(output.toString().getBytes());
		}
	}

	public static void main(String[] args) throws Exception {

		//clear list
		File f = new File("e:/list.txt");
		if (f.exists()) {
			f.delete();
		}
		//
		FileOutputStream fos = new FileOutputStream(f, true);
		File filePath = new File("E:\\360Downloads");
		listAll(filePath, fos);
		fos.close();
	}
}
