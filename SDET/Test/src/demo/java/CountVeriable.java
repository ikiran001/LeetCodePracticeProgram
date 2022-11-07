package demo.java;

import java.util.HashMap;
import java.util.Map;

public class CountVeriable {

	public static void Count(String n) {

		HashMap<Character, Integer> CharCount = new HashMap<Character, Integer>();

		char[] StrArray = n.toCharArray();

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

		String name = "ganesh";

		Count(name);

	}

}
