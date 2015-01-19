package javastudy.collection.set;

import java.util.TreeSet;


public class TreeSetTest {
	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<String>();
		
		set.add("b");
		set.add("a");
		set.add("f");
		set.add("e");
		set.add("d");
		set.add("c");
		
		System.out.println(set);
	}
}
