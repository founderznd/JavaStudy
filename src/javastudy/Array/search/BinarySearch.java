package javastudy.Array.search;

public class BinarySearch {

	public static int search(int[] array, int value) {

		int fi = 0;
		int la = array.length - 1;
		int m;

		while (fi <= la) {
			// 中间坐标
			m = (fi + la) / 2;
			// 打印出每次查找时中间坐标的位置。
			for (int i = 0; i < array.length; i++) {

				if (i == m)
					System.out.print("[" + array[i] + "] ");
				else
					System.out.print(array[i] + " ");
			}
			System.out.println();
			// 二分法查找
			if (array[m] == value) return m;
			if (value < array[m]) la = m - 1;
			if (value > array[m]) fi = m + 1;
		}
		// 查不到，返回-1
		return -1;
	}

	public static void main(String[] args) {

		int[] a = { 1, 3, 5, 7, 9, 10, 12 };
		int value = 5;

		int index = search(a, value);

		System.out.println(index);
	}

}
