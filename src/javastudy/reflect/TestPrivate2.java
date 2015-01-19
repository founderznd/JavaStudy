package javastudy.reflect;

import java.lang.reflect.Field;


//Ҫ�󣺸ı�private2�����˽������name�����ݣ�����ӡ������


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

