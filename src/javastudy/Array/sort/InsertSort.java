package javastudy.Array.sort;

public class InsertSort {

	public static void output(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void sort(int[] a) {

		for (int i = 1; i < a.length; i++) {

			int j = i;
			int tmp = a[j];
			/*
			 * 这里注意要把 a[j-1] >= tmp 写在后面。
			 * 因为当 j=0 时，Java在判断 a[j-1]时会出错。
			 * 而放在后面，Java会先判断j的值。
			 * 这时j=0不符合j>0的条件，所以直接跳出循环。
			 */
			while (j > 0 && a[j - 1] >= tmp) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = tmp;
		}
	}

	public static void main(String[] args) {

		int[] a = { 5, 2, 8, 6, 9, 4, 7 };
		output(a);
		sort(a);
		output(a);
	}
}
