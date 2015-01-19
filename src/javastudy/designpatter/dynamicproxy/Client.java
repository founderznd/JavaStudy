package javastudy.designpatter.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/*
 * 1������һ��ʵ�ֽӿ� InvocationHandler���࣬������ʵ�� invoke����
 * 2����������������Լ��ӿ�
 * 3��ͨ�� Proxy�ľ�̬����
 * Proxy.newProxyInstance(
 * 	ClassLoader loader, 
 * 	Class[] interfaces, 
 * 	InvocationHandler h) 
 * ����һ������
 * 4��ͨ��������÷���
 */


public class Client {

	public static void main(String[] args) {
		
		RealSubject realSubject = new RealSubject();
		
		InvocationHandler handler = new DynamicSubjectProxy(realSubject);
				
		//�������һ�������ɴ���
		//����һ����̬���࣬��ʵ����realSubject�Ľӿڣ�Subject�ӿڣ�
		Subject subject = (Subject)Proxy.newProxyInstance(
				realSubject.getClass().getClassLoader(),
				realSubject.getClass().getInterfaces(),
				handler);
		
		//�����ǵ��øö�����κη���ʱ����������ת��hanlder�����invoke����
		//public Object invoke(Object proxy, Method method, Object[] args)
		//���� subject.request()�е�request�ʹ��ݸ��������Method method
		//���request()���в�������������ݸ�Object[] args
		
		subject.request();
		
		subject.request("hello");
		
		System.out.println(subject.getClass());
	}
}
