package javastudy.collection.set;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();

		System.out.println(set.add("a"));
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("e");
		System.out.println(set.add("a"));

		System.out.println(set);
	}
}
