package com.vuong.sort;

import java.util.Arrays;

public class BubbleSort {
	public static void sort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			System.out.println(Arrays.toString(a));
		}
	}

	public static void main(String[] args) {
		int[] a = { 9, 7, 12, 8, 6, 5 };
		BubbleSort.sort(a);
	}
}
