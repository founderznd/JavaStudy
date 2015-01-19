package javastudy.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
/*
 * ����
 * 1����ȡclass����
 * 2�����ɸö�������Ӧ���һ��ʵ��
 * 3����ȡ�ö���ķ���
 * 4��ͨ������ʵ���ķ����õ����
 */
public class ReflectTester {

	// �ķ�����ʵ�ֶ�Customer����Ŀ�������
	public Object copy(Object object) throws Exception {

		Class<?> classtyp = object.getClass();

		Object objectcopy = classtyp.getConstructor(new Class[]{}).newInstance(new Object[]{});
		
		//��ö�������г�Ա������
		Field[] fields = classtyp.getDeclaredFields();
		//ͨ����Ա������ȡ���еķ���
		for (Field field : fields) {
			String name = field.getName();
			//�����Ե�����ĸת��Ϊ��д
			String firstLetter = name.substring(0,1).toUpperCase();
			//������Ҫ��ȡ�ķ���������
			String getMethodName = "get" + firstLetter + name.substring(1);
			String setMethodName = "set" + firstLetter + name.substring(1);
			//��ȡget����
			Method getMethod = classtyp.getMethod(getMethodName, new Class[]{});
			//��ȡset������set�����Ĳ�����class���;�������Ӧ�ĳ�Ա������class����
			Method setMethod = classtyp.getMethod(setMethodName, new Class[]{field.getType()});
			
			//����ԭʵ��object��getName�������õ�ԭʵ��������
			Object value = getMethod.invoke(object, new Object[]{});
			//������д����ʵ�����У���ɿ�������
			setMethod.invoke(objectcopy, new Object[]{value});
		}
		
		// Constructor<?> cons = typ.getConstructor(new Class[]{String.class,
		// int.class});
		//
		// Object obj = cons.newInstance(new Object[]{"nandi",27});
		//
		// �������д����������һ��,��������Ĵ����޷����ܲ�����
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