package com.Practice;

public class SortString {

	public static char[] sort(String n) {

		char s[] = n.toCharArray();
		char temp;

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if (s[j] > s[i]) {
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}

		}

		return s;
	}

	public static void main(String[] args) {

		String name = "ganeshGANESH";

		// sort(name);
		System.out.println(sort(name));

	}

}
