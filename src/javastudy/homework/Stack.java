package javastudy.homework;

import java.util.LinkedList;

public class Stack {

	public static LinkedList<Object> list = new LinkedList<Object>();

	public void push(Object obj) {

		list.add(obj);
	}

	public Object pop() {

//		if (isEmpty() == true) { return null; }
//		Object obj = list.getLast();
//		list.removeLast();
//		return obj;
		return list.removeLast();
	}

	public Object peek() {

		if (isEmpty() == true) { return null; }
		return list.getLast();

	}

	public boolean isEmpty() {

		return list.isEmpty();
	}

}
