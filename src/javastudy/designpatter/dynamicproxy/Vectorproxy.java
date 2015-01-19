package javastudy.designpatter.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Vector;

public class Vectorproxy implements InvocationHandler {

	private Object proxyObj;
	
	public Vectorproxy(Object obj) {
		this.proxyObj = obj;
	}
	
	public static Object factory(Object obj){
		
		Class<?> classtype = obj.getClass();
		
		return Proxy.newProxyInstance(
				classtype.getClassLoader(),
				classtype.getInterfaces(),
				new Vectorproxy(obj));
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		System.out.println("before:"+method);
		
		if (null != args) {
			for (Object object : args) {
				System.out.println(object);
			}
		}
		
		Object obj = method.invoke(proxyObj, args);
		
		System.out.println("after:"+method);
		
		return obj;
	}
	
	public static void main(String[] args) {
		
		
		@SuppressWarnings("unchecked")
		List<String> list = (List<String>)factory(new Vector<String>());
		
		System.out.println(list.getClass().getName());
		
		//��ʹ�����ɵ�list��������ⷽ��������ת�뵽invoke����ȥִ��
		//������Ȼû��д����������ṹ��Ȼ��������ݣ���Щ���ݶ��ǵ���invoke����ʱ
		//�����
		list.add("New");
		list.add("York");
		
		System.out.println(list);
		
		list.remove(0);
		
		System.out.println(list);	
	}
}
