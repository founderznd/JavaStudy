/**
 * @author Nandi Zhou
 * 2015年4月25日
 * 
 * CharSet 学习  
 */
package javastudy.io;

import java.nio.charset.Charset;
import java.util.Map.Entry;

public class CharSetTest {

	public static void main(String[] args) {

		//Map的遍历  推荐使用下面的方法
		for (Entry<String, Charset> entry : Charset.availableCharsets().entrySet()) {

			System.out.println(entry.getKey());
		}
	}
}
