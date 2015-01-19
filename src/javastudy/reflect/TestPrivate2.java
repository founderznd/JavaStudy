package javastudy.reflect;

import java.lang.reflect.Field;


//要求：改变private2里面的私有属性name的内容，并打印出来。


public class TestPrivate2 {
	
	public static void main(String[] args) throws Exception {
		
		Private2 p = new Private2();
		
		Class<?> classtype = p.getClass();
		
		Field field = classtype.getDeclaredField("name");
		
		field.setAccessible(true);
		
		field.set(p, "chenjie");
		
		System.out.println(p.getName());
	}
}

