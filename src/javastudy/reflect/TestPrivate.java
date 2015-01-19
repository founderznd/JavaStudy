package javastudy.reflect;

import java.lang.reflect.Method;

public class TestPrivate {

	public static void main(String[] args) throws Exception {
		
		Private p = new Private();
		
		Class<?> classtype = p.getClass();
		
		Method method = classtype.getDeclaredMethod("sayHello",new Class[]{String.class});
		
		//ѹ��java�ķ��ʿ��Ƽ�飬�����Ϳ��Ե���һ�����˽�з�����
		method.setAccessible(true);
		
		String res = (String)method.invoke(p, new Object[]{"nandi"});
		
		System.out.println(res);
	}
}
