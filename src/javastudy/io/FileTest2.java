/**
 * 
 */
package javastudy.io;

import java.io.File;
import java.io.IOException;


/**
 * 创建目录和文件
 * @author Nandi Zhou
 *
 */
public class FileTest2 {

	public static void main(String[] args) throws IOException {

		File f1 = new File("d:/test1/test2/test3/");
		f1.mkdirs();
		File f2 = new File(f1,"test.txt");
		f2.createNewFile();
	}
}
