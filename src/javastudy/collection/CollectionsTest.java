package javastudy.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsTest {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(new Integer(-8));
		list.add(new Integer(20));
		list.add(new Integer(-20));
		list.add(new Integer(8));

		Comparator<Object> r = Collections.reverseOrder();

		Collections.sort(list, r);

		// 当迭代的类已经重写了 toString 方法时，可以不用强制类型转换。比如Integer、或者String类型。
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		Collections.shuffle(list);
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		System.out.println("max number: "+ Collections.max(list));
		System.out.println("min number: "+ Collections.min(list));
	}
}
