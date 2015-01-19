package javastudy.jdk5.forloop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class ForTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		//old method
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//new method
		for (int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();
		//////////////////////////////////////////////////
		String[] names = {"hello","world","welcome"};
		for (String string : names) {
			System.out.print(string + " ");
		}
		System.out.println();
		///////////////////////////////////////////////////
		int[][] arr2 = {{1,2,3},
						{4,5,6},
						{7,8,9}};
		for (int[] is : arr2) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		////////////////////////////////////////////////////
		Collection<String> col = new ArrayList<String>();
		col.add("one");
		col.add("two");
		col.add("three");
		
		for (String string : col) {
			System.out.println(string);
		}
		////////////////////////////////////////////////////
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		//method1
		System.out.println("method1");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//method2
		System.out.println("method2");
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		//method3
		System.out.println("method3");
		for (String str : list) {
			System.out.println(str);
		}
	}
}











