package javastudy.Array;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		/*
		 * int[] a = new int[4]; //����һ������4��int���飬������Java������һ������
		 * 
		 * a[0] = 1; a[1] = 2; a[2] = 3; a[3] = 4;
		 * 
		 * System.out.println(a[3]);
		 */
		/*
		 * int a[] = new int[2];
		 * 
		 * a[0] = 1; a[1] = 2;
		 * 
		 * System.out.println(a[1]);
		 */
		/*
		 * int[] a = {1,2,3,4};
		 * 
		 * System.out.println(a[2]);
		 * 
		 * int[] b = new int[] {1,2,3,4};
		 * 
		 * System.out.println(b[3]);
		 */
		/*
		 * int[] a = new int[100];
		 * 
		 * for (int i = 0; i < a.length; i++) { a[i] = i; }
		 * 
		 * for (int i = 0; i < a.length; i++) { System.out.println(a[i]); }
		 */
		/*
		 * int[] a = new int[4]; System.out.println(a[0]);
		 * 
		 * boolean[] b = new boolean[4]; 
		 * 
		 * System.out.println(b[3]);
		 */
		int[] a = {1,2,3};
		int[] b = {1,2,3};
		
		//���鱾���equals���������ж���������ĵ�ַ�Ƿ�һ��
		System.out.println(a.equals(b));
		//��Ҫ�ж����������Ƿ�һ�£�����ϵͳ�ṩ��java.util.Array����ࡣ 
		System.out.println(Arrays.equals(a, b));
		
	}
}





















