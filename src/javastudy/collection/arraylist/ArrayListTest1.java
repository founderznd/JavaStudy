package javastudy.collection.arraylist;

import java.util.ArrayList;

public class ArrayListTest1 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("hello ");
		arrayList.add("world ");
		arrayList.add("world ");
		arrayList.add("welcome");

		// get the data with index in arrayList
		String s0 = (String)arrayList.get(0);
		String s1 = (String)arrayList.get(1);
		String s2 = (String)arrayList.get(2);
		String s3 = (String)arrayList.get(3);
		System.out.println(s0 + s1 + s2 + s3);

		// get the size of the arraylist
		System.out.println(arrayList.size());

		// print
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i));
		}
		System.out.println();

		// remove a element
		arrayList.remove(0);
		System.out.println(arrayList.size());
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i));
		}
		System.out.println();

		arrayList.remove("world ");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i));
		}
		System.out.println();

		// print the index of a element
		System.out.println(arrayList.indexOf("world "));

		// clear
		arrayList.clear();
		System.out.println(arrayList.isEmpty());
	}
}
