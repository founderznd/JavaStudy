/**
 * @author Nandi Zhou
 * 2015��4��25��
 * 
 * CharSet ѧϰ  
 */
package javastudy.io;

import java.nio.charset.Charset;
import java.util.Map.Entry;

public class CharSetTest {

	public static void main(String[] args) {

		//Map�ı���  �Ƽ�ʹ������ķ���
		for (Entry<String, Charset> entry : Charset.availableCharsets().entrySet()) {

			System.out.println(entry.getKey());
		}
	}
}
