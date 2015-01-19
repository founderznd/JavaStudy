package javastudy.Array.search;

public class BinarySearch {

	public static int search(int[] array, int value) {

		int fi = 0;
		int la = array.length - 1;
		int m;

		while (fi <= la) {
			// �м�����
			m = (fi + la) / 2;
			// ��ӡ��ÿ�β���ʱ�м������λ�á�
			for (int i = 0; i < array.length; i++) {

				if (i == m)
					System.out.print("[" + array[i] + "] ");
				else
					System.out.print(array[i] + " ");
			}
			System.out.println();
			// ���ַ�����
			if (array[m] == value) return m;
			if (value < array[m]) la = m - 1;
			if (value > array[m]) fi = m + 1;
		}
		// �鲻��������-1
		return -1;
	}

	public static void main(String[] args) {

		int[] a = { 1, 3, 5, 7, 9, 10, 12 };
		int value = 5;

		int index = search(a, value);

		System.out.println(index);
	}

}
