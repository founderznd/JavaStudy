package javastudy.Array;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		/*
		 * int[] a = new int[4]; //定义一个长度4的int数组，数组在Java里面是一个对象
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
		
		//数组本身的equals方法用于判断两个数组的地址是否一致
		System.out.println(a.equals(b));
		//想要判断数组内容是否一致，可用系统提供的java.util.Array这个类。 
		System.out.println(Arrays.equals(a, b));
		
	}
}





















