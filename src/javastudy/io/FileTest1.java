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

		File file = new File("d:/test.txt");// �Ƽ�·��  ʹ��/  ��Ϊ����ϵͳ��ͨ�ã�Ҳ����d:\\test����ʽ������ֻ����windows��ʹ��
		System.out.println(file.createNewFile());
	}
}
