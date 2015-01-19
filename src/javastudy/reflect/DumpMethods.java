package javastudy.reflect;

import java.lang.reflect.Method;
/*
 * 反射
 * 1、获取class对象。
 * 2、生成该对象所对应类的一个实例
 * 3、获取该对象的方法
 * 4、通过调用实例的方法得到结果
 */
public class DumpMethods {
	
	public static void main(String[] args) throws Exception {

		Class<?> classtyp = Class.forName("java.lang.String");
		
		Method[] methods = classtyp.getDeclaredMethods();
		
		for (Method method : methods) {
			System.out.println(method);
		}
	}
}
