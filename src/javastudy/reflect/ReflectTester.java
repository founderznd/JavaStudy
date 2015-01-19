package javastudy.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
/*
 * 反射
 * 1、获取class对象。
 * 2、生成该对象所对应类的一个实例
 * 3、获取该对象的方法
 * 4、通过调用实例的方法得到结果
 */
public class ReflectTester {

	// 改方法是实现对Customer对象的拷贝操作
	public Object copy(Object object) throws Exception {

		Class<?> classtyp = object.getClass();

		Object objectcopy = classtyp.getConstructor(new Class[]{}).newInstance(new Object[]{});
		
		//获得对象的所有成员变量。
		Field[] fields = classtyp.getDeclaredFields();
		//通过成员变量获取所有的方法
		for (Field field : fields) {
			String name = field.getName();
			//将属性的首字母转化为大写
			String firstLetter = name.substring(0,1).toUpperCase();
			//生成需要获取的方法的名字
			String getMethodName = "get" + firstLetter + name.substring(1);
			String setMethodName = "set" + firstLetter + name.substring(1);
			//获取get方法
			Method getMethod = classtyp.getMethod(getMethodName, new Class[]{});
			//获取set方法，set方法的参数的class类型就是他对应的成员变量的class类型
			Method setMethod = classtyp.getMethod(setMethodName, new Class[]{field.getType()});
			
			//调用原实例object的getName方法，得到原实例的属性
			Object value = getMethod.invoke(object, new Object[]{});
			//将属性写入新实例当中，完成拷贝过程
			setMethod.invoke(objectcopy, new Object[]{value});
		}
		
		// Constructor<?> cons = typ.getConstructor(new Class[]{String.class,
		// int.class});
		//
		// Object obj = cons.newInstance(new Object[]{"nandi",27});
		//
		// 以上两行代码等于下面一行,但是下面的代码无法接受参数。
		// Object obj2 = typ.newInstance();


		return objectcopy;
	}

	public static void main(String[] args) throws Exception {
		
		Customer customer = new Customer("nandi", 20);
		customer.setId(new Long(1));
		
		ReflectTester test = new ReflectTester();
		
		Customer customer2 = (Customer)test.copy(customer);	
		
		System.out.println(customer2.getId() + "," + customer2.getName() + "," + customer2.getAge());
		
	}
}

class Customer {

	private Long id;

	private String name;

	private int age;

	public Customer() {
		this.id = 1L;
		this.name = "jie";
		this.age = 99;
	}

	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
}