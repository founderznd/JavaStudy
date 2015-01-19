package javastudy.Array.sort;

public class BubbleSort {
	public static void sort(int[] a) {	
		boolean changed;
		for (int i = 1; i < a.length; i++) {
			changed = false;
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					changed = true;
				}
			}
			System.out.print("µÚ" + i + "´ÎÅÅĞò£º");
			output(a);
			if (changed == false) {
				return;
			}
		}
	}
		
	public static void output(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int[] a = {2,1,3,4,5};
		output(a);
		sort(a);
	}
}
