package javastudy.Array;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4};
		int[] b = new int[4];
		int[] d = new int[4];
		
		//method 1
		System.arraycopy(a, 0, b, 0, a.length);
		
		//method 2
		d = Arrays.copyOf(a, d.length);
		
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}
		System.out.println();
		
		System.out.println(Arrays.equals(b, d));
		
	}
}
