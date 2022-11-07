package com.Practice;

import java.util.HashSet;

public class RemDub {

	public static String rd(String n) {

		HashSet<Character> set = new HashSet<Character>();

		char s[] = n.toCharArray();

		for (char c : s) {
			set.add(c);
		}
		
		for (char c : set) {
			System.out.print(c);
		}

		return null;

	}

	public static void main(String[] args) {

		String name = "aaaaabbbbccccdddeeefff";

		rd(name);

	}

}
