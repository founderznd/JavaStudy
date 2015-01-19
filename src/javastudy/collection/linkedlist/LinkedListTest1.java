package javastudy.collection.linkedlist;

import java.util.LinkedList;

public class LinkedListTest1 {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("F");
		list.add("B");
		list.add("D");
		list.add("E");
		list.add("C");
		
		list.addLast("Z");
		list.addFirst("A");
		
		list.add(1,"a");
		
		System.out.println("the prime list: " + list);
		
		list.remove("F");
		list.remove(2);
		
		System.out.println("the changed list: " + list);
		
		list.set(2,"changed");
		
		System.out.println("the changed list: " + list);
	}
}
