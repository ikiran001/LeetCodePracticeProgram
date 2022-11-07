package demo.java;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String name = "kiran";
		String name1 = "hsenag";

		// StringBuffer s1=new StringBuffer(name);
		// StringBuffer s2=new StringBuffer(name1);

		char[] s = name.toCharArray();
		char[] s1 = name1.toCharArray();

		Arrays.sort(s);
		Arrays.sort(s1);
		System.out.println(s);
		System.out.println(s1);
		
		if (Arrays.equals(s, s1)) {
			System.out.println("Done");
		}

	}

}
