package javastudy.collection.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest3 {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<String>(new MyComparator<String>());

		set.add("d");
		set.add("c");
		set.add("b");
		set.add("B");
		set.add("a");
		set.add("e");
		set.add("f");

		for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
			String str = (String)iterator.next();
			System.out.print(str.toString() + " ");
		}
		System.out.println();
	}
}
//设定自己的排序方法
class MyComparator<T> implements Comparator<T> {

	public int compare(T o1, T o2) {

		String s1 = (String)o1;
		String s2 = (String)o2;
		
		return s2.compareTo(s1);
	}
}
