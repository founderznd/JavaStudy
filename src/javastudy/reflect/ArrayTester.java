package javastudy.reflect;

import java.lang.reflect.Array;

public class ArrayTester {

	public static void main(String[] args) {
		
		Class<?> classtype = String.class;
		
		Object array = Array.newInstance(classtype, 10);
		
		Array.set(array, 5, "hello");
		
		String str = (String)Array.get(array, 5);
		
		System.out.println(str);
	}
}
