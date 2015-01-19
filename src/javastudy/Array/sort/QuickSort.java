package javastudy.Array.sort;

public class QuickSort {

	private static int[] a;

	public static void output(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void sort(int[] b) {
		a = b;
		quickSort(0, a.length - 1);
	}

	private static void quickSort(int low, int high) {

		int i = low;
		int j = high;
		int x = a[(i + j) / 2];

		while (i <= j) {

			while (a[i] < x)
				i++;
			while (a[j] > x)
				j--;

			if (i <= j) {
				int tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
				i++;
				j--;
			}
		}

		if (low < j)
			quickSort(low, j);
		if (i < high)
			quickSort(i, high);

	}

	public static void main(String[] args) {
		int[] a = { 5, 2, 8, 6, 23, 9, 4, 7, 6, 2, 1 };
		output(a);
		sort(a);
		output(a);
	}
	
}
