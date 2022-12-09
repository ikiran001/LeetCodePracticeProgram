package Stringssss;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1408 {

	public static void main(String[] args) {
		String[] words = {"leetcode","et","code"};
		System.out.println(stringMatching(words));

	}

	public static List<String> stringMatching(String[] words) {
		ArrayList<String> list=new ArrayList<>();

		for (int i = 0; i < words.length; i++) {
			int count=0;
			for (int j = 0; j < words.length; j++) {
				if(words[j].contains(words[i])) {
					count++;
					if(count==2) {
						list.add(words[i]);
						break;
					}
				}
			}
		}
		return list;
	}

}
