package javastudy.homework;

import java.util.Random;
import javastudy.Array.sort.*;
import javastudy.Array.search.*;

public class Homework1 {

	public static void output(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		//initialization
		Random random = new Random();
		int[] array = new int[50];
		
		//random 50 numbers between [10,50]
		for (int i = 0; i < array.length; i++) {
			array[i] = 10+random.nextInt(41);
		}		
		output(array);
		
		//sort this array
		QuickSort.sort(array);
		output(array);
		
		//calculate the appearance time of every number
		int[] num = new int[array.length+1];
		
		for (int i = 0; i < array.length; i++) {
			num[array[i]]++;
		}
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] != 0) {
				System.out.println("数字 "+ i + " 出现了 " + num[i] + " 次。");
			}
		}
		int index = SearchBig.search(num);
		System.out.println("数字 "+ index + " 出现最多，为 " + num[index] + " 次。");
	}
}
