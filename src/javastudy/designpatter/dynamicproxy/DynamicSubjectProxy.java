package javastudy.designpatter.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 该代理类的内部属性是Object类型，实际使用的时候通过该类的构造方法传进一个对象
 * 此外，该类还实现了invoke方法，该方法中的method.invoke其实就是调用被代理对象
 * 的将要执行的方法，参数就是sub，表示该方法从属于sub，通过动态代理类，我们可以
 * 在执行真实对象的方法前后加入自己的一些额外方法。
 *
 */
public class DynamicSubjectProxy implements InvocationHandler {

	private Object sub;

	public DynamicSubjectProxy(Object obj) {
		this.sub = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {

		//System.out.println("before calling: " + method);

		method.invoke(sub, args);

		//System.out.println("after calling: " + method);

		return null;
	}
}
