package javastudy.jdk5.autoboxing;

import java.util.ArrayList;
import java.util.Collection;
/*
 * 自动装箱和拆箱
 */

public class BoxTest {

	public static void main(String[] args) {

		int a = 3;

		Collection<Integer> e = new ArrayList<Integer>();
		
		e.add(3);//将int类型的3自动转化为Integer类型并放到集合当中。
		
		e.add(a + 3);
		
		for (Integer i : e) {
			System.out.println(i);
		}
	}
}
