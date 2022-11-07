package demo.java;

import java.util.HashMap;
import java.util.Map;

public class CountIntVeriable {

	public static void Count(int n) {

		HashMap<Character, Integer> CharCount = new HashMap<Character, Integer>();

		String temp = Integer.toString(n);
		int [] no = new int [temp.length()];
		
		for (int i = 0; i < temp.length(); i++) {
			no[i]=temp.charAt(i)-'0';
			System.out.println(no[i]);
		}
		
		
		 
		
		
		
		
		
		

		for (char c : StrArray) {

			if (CharCount.containsKey(c)) {
				CharCount.put(c, CharCount.get(c) + 1);

			} else {

				CharCount.put(c, 1);
			}

		}

		for (Map.Entry entry : CharCount.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

	public static void main(String[] args) {

		int name = 123123123;

		Count(name);

	}

}
