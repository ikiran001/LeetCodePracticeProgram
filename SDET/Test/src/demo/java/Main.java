package demo.java;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 115341351;

		String temp = Integer.toString(number);

		System.out.println(temp);

		char[] c = temp.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char i : c) {  // n
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		System.out.println(map);
	}

}