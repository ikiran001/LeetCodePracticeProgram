package com.Practice;

import java.util.Arrays;

public class ArrPreAdd {

	public static int[] add(int arr[], int s) {

		int sum = 0;
		int nArr[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			arr[i] = sum;
		}

		return arr;
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4 };
		int l = a.length;
		System.out.println(l);
		int m[] = add(a, l);
		System.out.println(Arrays.toString(m));

	}

}
