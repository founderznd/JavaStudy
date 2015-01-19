package javastudy.Array.search;

import javastudy.Array.sort.*;

public class ArraySearchTest {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 5, 7, 6, 10, 3, 9 };
		int value = 11;
		QuickSort.sort(a);
		QuickSort.output(a);
		int index = search(a, value);
		System.out.println(index);

	}

	public static int search(int[] a, int value) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] == value) {
				return i;
			}
		}
		return -1;
	}
}
