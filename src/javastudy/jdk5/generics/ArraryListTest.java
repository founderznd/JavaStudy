package javastudy.jdk5.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraryListTest {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");

		for (int i = 0; i < list.size(); i++) {
			String value = list.get(i);
			System.out.println(value);
		}
		System.out.println("********************************");
		//iterator in generic
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String value = iterator.next();
			System.out.println(value);
		}

	}
}
