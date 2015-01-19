package javastudy.designpatter.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/*
 * 1、创建一个实现接口 InvocationHandler的类，它必须实现 invoke方法
 * 2、创建被代理的类以及接口
 * 3、通过 Proxy的静态方法
 * Proxy.newProxyInstance(
 * 	ClassLoader loader, 
 * 	Class[] interfaces, 
 * 	InvocationHandler h) 
 * 创建一个代理
 * 4、通过代理调用方法
 */


public class Client {

	public static void main(String[] args) {
		
		RealSubject realSubject = new RealSubject();
		
		InvocationHandler handler = new DynamicSubjectProxy(realSubject);
				
		//下面代码一次性生成代理
		//生成一个动态的类，并实现了realSubject的接口（Subject接口）
		Subject subject = (Subject)Proxy.newProxyInstance(
				realSubject.getClass().getClassLoader(),
				realSubject.getClass().getInterfaces(),
				handler);
		
		//当我们调用该对象的任何方法时，流程立刻转到hanlder里面的invoke方法
		//public Object invoke(Object proxy, Method method, Object[] args)
		//其中 subject.request()中的request就传递给了上面的Method method
		//如果request()中有参数，则参数传递给Object[] args
		
		subject.request();
		
		subject.request("hello");
		
		System.out.println(subject.getClass());
	}
}
