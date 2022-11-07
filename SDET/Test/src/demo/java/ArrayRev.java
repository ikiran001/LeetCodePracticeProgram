package demo.java;

import java.util.ArrayList;

public class ArrayRev {

	public static ArrayList<Integer> rev(int[] arr) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = arr.length - 1; i >= 0; i--) {
			int rev = arr[i];
			list.add(rev);
		}

		return list;
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };

		rev(a);
		System.out.println(rev(a));
	}

}
