package javastudy.reflect;

public class ClassTest {

	//getSuperclass���Ի�ȡ����
	public static void main(String[] args) {
		
		Class<?> classtype = Child.class;
		
		System.out.println(classtype);
		
		classtype = classtype.getSuperclass();
		
		System.out.println(classtype);
		
		classtype = classtype.getSuperclass();
		
		System.out.println(classtype);
		
		classtype = classtype.getSuperclass();
		
		System.out.println(classtype);
		
		//ע��class �� TYPE������
		Class<?> classtype2 = Boolean.class;
		
		System.out.println(classtype2);
		
		Class<?> classtype3 = Boolean.TYPE;
		
		System.out.println(classtype3);
	}
}

class Parent{
	
	
}

class Child extends Parent{
	
}
