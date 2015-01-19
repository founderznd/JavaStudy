package javastudy.collection.arraylist;

import java.util.ArrayList;

public class ArrayListTest4 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		list.add(new Integer(4));
		list.add(new Integer(5));
		list.add(new Integer(6));

		Object[] in = list.toArray();

		for (int i = 0; i < in.length; i++) {
			System.out.println(((Integer)in[i]).intValue());
		}
	}
}
