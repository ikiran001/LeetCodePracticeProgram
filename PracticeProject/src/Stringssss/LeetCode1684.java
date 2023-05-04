package Stringssss;

public class LeetCode1684 {

	public static void main(String[] args) {

		String a="ab";
		String[] arr= {"ad","bd","aaab","baa","badab"};
		System.out.println(countConsistentStrings(a, arr));
		

	}
	public static int countConsistentStrings(String allowed, String[] words) {
		int len=words.length;
		int c=0;
		for (int i = 0; i < words.length; i++) {
			for(char ch:words[i].toCharArray()) {
				if(!allowed.contains(String.valueOf(ch))) {
					c++;
					break;
				}
			}
		}
		return len-c;
	}
}
