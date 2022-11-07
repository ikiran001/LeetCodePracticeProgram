package com.Practice;

import java.util.Arrays;

public class IntSep {

	public static void main(String[] args) {
		int n = 123123;

		String temp = Integer.toString(n);
		char[] c = temp.toCharArray();
		System.out.println(Arrays.toString(c));

		while (n != 0) {
			int a = n % 10;
			  n = n / 10;

			System.out.print(a + " ");
		}
	}

}
