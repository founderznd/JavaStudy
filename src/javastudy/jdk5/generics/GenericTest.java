package javastudy.jdk5.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * 通配符 ？ 可以让类在被引用的时候 更加灵活
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

		//ge 可以指向含有所有实现了 List 接口的 参数的对象。
		GenericTest<? extends List<?>> ge = null;
		ge = new GenericTest<LinkedList<?>>();
		ge = new GenericTest<ArrayList<?>>();
		ge.setFoo(null);

		//ge 可以指向含有所有List的父类的参数的对象
		GenericTest<? super List<?>> ge2 = null;
		ge2 = new GenericTest<Object>();
		ge2.setFoo(null);

		GenericTest<String> ge3 = new GenericTest<String>();
		ge3.setFoo("hello world");

		//<?>等价于<? extends Object>
		GenericTest<? extends Object> ge4 = ge3;
		System.out.println(ge4.getFoo());

		ge4.setFoo(null);
		System.out.println(ge4.getFoo());

		//ge4.setFoo("welcome");
	}
}








