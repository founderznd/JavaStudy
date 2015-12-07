/**
 * 
 */
package javastudy.io;

import java.io.File;
import java.io.IOException;


/**
 * @author Nandi Zhou
 *
 */
public class FileTest1 {

	public static void main(String[] args) throws IOException {

		File file = new File("d:/test.txt");// 推荐路径  使用/  因为所有系统都通用，也可以d:\\test的形式，但是只能在windows上使用
		System.out.println(file.createNewFile());
	}
}
