package javastudy.homework;

import java.util.Random;

public class Homework1Muster {

	public static void main(String[] args) {

		// initializiation
		int[] count = new int[41];
		Random random = new Random();

		// random 50 numbers in [10,50]
		// record their appearance time.
		for (int i = 0; i < count.length; i++) {
			int n = random.nextInt(41);
			count[n]++;
		}

		int max = count[0];
		for (int i = 0; i < count.length; i++) {
			// ensure which number have the most appearance time.
			if (max < count[i]) {
				max = count[i];
			}
			// print each number with the apperance time.
			if (count[i] != 0) {
				System.out.println(i + 10 + " appearance time: " + count[i]);
			}
		}
		// print the number with the most appearance time.
		for (int i = 0; i < count.length; i++) {
			if (max == count[i]) {
				System.out.println(i + 10 + " appearance the most times: "
						+ max);
			}
		}
	}
}
