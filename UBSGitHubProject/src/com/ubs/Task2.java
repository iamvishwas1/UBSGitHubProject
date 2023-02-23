package com.ubs;
import java.util.HashSet;

public class Task2 {

	public static void main(String[] args) {

		Task2 task2 = new Task2();
		int[] a = { 4, 9, 5 };
		int[] b = { 9, 4, 9, 8, 4 };

		task2.getCommonNumbersFromBothArrays(a, b);

	}

	public void getCommonNumbersFromBothArrays(int[] a, int[] b) {

		// Defining set container set
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> commonSet = new HashSet<>();
		// Inserting array elements in set and commonSet
		for (int i = 0; i < a.length; i++)
			set.add(a[i]);

		for (int i = 0; i < b.length; i++)
			if (set.contains(b[i]))
				commonSet.add(b[i]);

		System.out.print(commonSet.toString() + " "); // commonSet will contain only distinct
														// elements from array a and b

	}
}
