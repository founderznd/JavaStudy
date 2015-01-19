package javastudy.jdk5.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * 在定义泛型类别时，也可以限制其使用范围。用 extends 关键字。 Java 默认 extends Object
 */
public class ListGenericFoo<T extends List<Integer>> {

	private T foo;

	public T getFoo() {

		return foo;
	}

	public void setFoo(T foo) {

		this.foo = foo;
	}

	public static void main(String[] args) {

		ListGenericFoo<LinkedList<Integer>> foo1 = new ListGenericFoo<LinkedList<Integer>>(); 
		ListGenericFoo<ArrayList<Integer>> foo2 = new ListGenericFoo<ArrayList<Integer>>();

		LinkedList<Integer> linkedLists = new LinkedList<Integer>();
		foo1.setFoo(linkedLists);

		ArrayList<Integer> arrayLists = new ArrayList<Integer>();
		foo2.setFoo(arrayLists);
	}
}
