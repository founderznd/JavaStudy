/**
 * @author Nandi Zhou
 * 2015��4��23��
 * ��ȡ�ļ� ����ʾ����������
 */
package javastudy.io;

import java.io.BufferedReader;
import java.io.FileReader;


public class FileReader1 {

	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("list.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		
		while (null != (str = br.readLine())) {
			System.out.println(str);
		}
		
		br.close();
	}
}
