package com.Practice;

import java.util.ArrayList;

public class ArrRev {

	public static ArrayList<Integer> rev(int[] arr) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = arr.length - 1; i >= 0; i--) {
			int rev = arr[i];
			list.add(rev);
		}

		return list;
	}

	public static void main(String[] args) {

		int a[] = { 5, 4, 3, 2, 1 };
		// rev(a);
		System.out.println(rev(a));

	}

}
