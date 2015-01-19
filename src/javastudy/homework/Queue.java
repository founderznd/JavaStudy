package javastudy.homework;

import java.util.LinkedList;

public class Queue {
 
	private static LinkedList<Object> list = new LinkedList<Object>();

	public void put(Object obj) {

		list.add(obj);
	}

	public Object get() {

//		if (isEmpty() == true) { return null; }
//		Object obj = list.getFirst();
//		list.removeFirst();
//		return obj;
		return list.removeFirst();
	}

	public boolean isEmpty() {

		return (list.isEmpty());
	}

}
