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
			 * ����ע��Ҫ�� a[j-1] >= tmp д�ں��档
			 * ��Ϊ�� j=0 ʱ��Java���ж� a[j-1]ʱ�����
			 * �����ں��棬Java�����ж�j��ֵ��
			 * ��ʱj=0������j>0������������ֱ������ѭ����
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
