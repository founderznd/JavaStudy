package javastudy.reflect;

public class ClassTest {

	//getSuperclass可以获取父类
	public static void main(String[] args) {
		
		Class<?> classtype = Child.class;
		
		System.out.println(classtype);
		
		classtype = classtype.getSuperclass();
		
		System.out.println(classtype);
		
		classtype = classtype.getSuperclass();
		
		System.out.println(classtype);
		
		classtype = classtype.getSuperclass();
		
		System.out.println(classtype);
		
		//注意class 和 TYPE的区别
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
