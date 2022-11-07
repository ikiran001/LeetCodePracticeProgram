package demo.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IntSep {

	public static void main(String[] args) {
		HashMap<Character, Integer> CharCount = new HashMap<Character, Integer>();
		int number = 110101;
		String temp = Integer.toString(number);
		int[] numbers = new int[temp.length()];
		ArrayList<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < temp.length(); i++) {
			numbers[i] = temp.charAt(i) - '0';
			//list.add(numbers[i]);
		
		
		System.out.print(list);
		}for (char c : numbers[i]) {

			if (CharCount.containsKey(c)) {
				CharCount.put(c, CharCount.get(c) + 1);
			//	CharCount.

			} else {

				CharCount.put(c, 1);
			}

		}}

		for (Map.Entry entry : CharCount.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		

	}

}
