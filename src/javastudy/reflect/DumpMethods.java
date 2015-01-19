package javastudy.reflect;

import java.lang.reflect.Method;
/*
 * ����
 * 1����ȡclass����
 * 2�����ɸö�������Ӧ���һ��ʵ��
 * 3����ȡ�ö���ķ���
 * 4��ͨ������ʵ���ķ����õ����
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
