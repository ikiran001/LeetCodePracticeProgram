package Stringssss;

public class LeetCode1967 {

	public static void main(String[] args) {
		String[] arr= {"a","a","a"};
		String word="ab";
		System.out.println(numOfStrings(arr, word));

	}
	public static  int numOfStrings(String[] patterns, String word) {
		int c=0;
		for (int i = 0; i < patterns.length; i++) {
			if(!word.contains(patterns[i])) {
				c++;
			}
		}
		return patterns.length-c;
	}
}
