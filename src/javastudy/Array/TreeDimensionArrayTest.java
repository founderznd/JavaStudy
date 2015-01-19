package javastudy.Array;

public class TreeDimensionArrayTest {
	
	public static void main(String[] args) {
		
		int[][][] a = new int[2][3][4];
		
		System.out.println(a instanceof int[][][]);
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					a[i][j][k] = i+j+k;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.print(a[i][j][k] + " ");
				}
				System.out.println();
			}
		}
	}
}
