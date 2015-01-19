package javastudy.Array;

public class ArrayTest4 {
	public static void main(String[] args) {

		int[][] i = new int[2][3];
		//i是一个对象。
		System.out.println(i instanceof Object);
		
		// i[0]本身就是一个一维数组。
		System.out.println(i[0] instanceof int[]);

		System.out.println("i.length = " + i.length);
		System.out.println("i[0].length = " + i[0].length);

		int m = 0;
		for (int j = 0; j < i.length; j++) {
			for (int j2 = 0; j2 < i[j].length; j2++) {
				m++;
				i[j][j2] = 2*m;
			}
		}
		
		for (int j = 0; j < i.length; j++) {
			for (int j2 = 0; j2 < i[j].length; j2++) {
				System.out.println(i[j][j2]);
			}
		}
		
	}
}
