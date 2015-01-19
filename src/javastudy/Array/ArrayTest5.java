package javastudy.Array;

public class ArrayTest5 {

	public static void main(String[] args) {

		// 定义不规整的数组
		int[][] a = new int[3][];
		a[0] = new int[2];
		a[1] = new int[3];
		a[2] = new int[1];

		int[][] b = new int[][] { { 1, 2, 3 }, { 4 }, { 5, 6, 7, 8 } };

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

	}

}
