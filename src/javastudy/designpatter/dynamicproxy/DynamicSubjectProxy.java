package javastudy.designpatter.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * �ô�������ڲ�������Object���ͣ�ʵ��ʹ�õ�ʱ��ͨ������Ĺ��췽������һ������
 * ���⣬���໹ʵ����invoke�������÷����е�method.invoke��ʵ���ǵ��ñ��������
 * �Ľ�Ҫִ�еķ�������������sub����ʾ�÷���������sub��ͨ����̬�����࣬���ǿ���
 * ��ִ����ʵ����ķ���ǰ������Լ���һЩ���ⷽ����
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
