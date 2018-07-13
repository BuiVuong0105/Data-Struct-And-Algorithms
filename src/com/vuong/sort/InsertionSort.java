package com.vuong.sort;

import java.util.Arrays;

public class InsertionSort {
	public static void sort(int[] a) {
		int n = a.length;
		for(int i = 1; i<n ;i++){
			int key = a[i];
			int j = i-1;
			while(j>=0 && a[j]>key){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
			System.out.println(Arrays.toString(a));
		}
	}

	public static void main(String[] args) {
		int[] a = { 9, 7, 12, 8, 6, 5 };
		InsertionSort.sort(a);
	}
}
