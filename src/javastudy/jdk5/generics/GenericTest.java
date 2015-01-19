package javastudy.jdk5.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * ͨ��� �� ���������ڱ����õ�ʱ�� �������
 */
public class GenericTest<T> {

	private T foo;

	public T getFoo() {

		return foo;
	}

	public void setFoo(T foo) {

		this.foo = foo;
	}

	public static void main(String[] args) {

		//ge ����ָ��������ʵ���� List �ӿڵ� �����Ķ���
		GenericTest<? extends List<?>> ge = null;
		ge = new GenericTest<LinkedList<?>>();
		ge = new GenericTest<ArrayList<?>>();
		ge.setFoo(null);

		//ge ����ָ��������List�ĸ���Ĳ����Ķ���
		GenericTest<? super List<?>> ge2 = null;
		ge2 = new GenericTest<Object>();
		ge2.setFoo(null);

		GenericTest<String> ge3 = new GenericTest<String>();
		ge3.setFoo("hello world");

		//<?>�ȼ���<? extends Object>
		GenericTest<? extends Object> ge4 = ge3;
		System.out.println(ge4.getFoo());

		ge4.setFoo(null);
		System.out.println(ge4.getFoo());

		//ge4.setFoo("welcome");
	}
}








