package javastudy.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();

		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("e");

		// Iterator iter = set.iterator();
		// while (iter.hasNext()) {
		// String value = (String)iter.next();
		// System.out.println(value);
		// }

		for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
			String value = iterator.next();
			System.out.println(value);
		}
	}
}
