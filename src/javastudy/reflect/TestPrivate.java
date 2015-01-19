package javastudy.reflect;

import java.lang.reflect.Method;

public class TestPrivate {

	public static void main(String[] args) throws Exception {
		
		Private p = new Private();
		
		Class<?> classtype = p.getClass();
		
		Method method = classtype.getDeclaredMethod("sayHello",new Class[]{String.class});
		
		//压制java的访问控制检查，这样就可以调用一个类的私有方法。
		method.setAccessible(true);
		
		String res = (String)method.invoke(p, new Object[]{"nandi"});
		
		System.out.println(res);
	}
}
