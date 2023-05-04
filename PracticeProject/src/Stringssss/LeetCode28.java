package Stringssss;

public class LeetCode28 {

	public static void main(String[] args) {
		String stack="mississippi";
		String b="issip";
		System.out.println(strStr(stack, b));
	}


	public static  int strStr(String haystack, String needle) {
		int h=haystack.length();
		int n=needle.length();
		if(h<n) return -1;
		for (int i = 0; i < h-n; i++) {
			int j=0;
			while(j<n && haystack.charAt(i+j)==needle.charAt(j)) {
				j++;
			}
			if(j==n) {
				return i;
			}
		}
		return -1;
	}
}

//	public static int helper(String stack,String needle, int i) {
//		if(stack.substring(0).contains(needle)) {
//			return i;
//		}
//		return helper(stack.substring(i, needle.length()+1), needle, i+1);
//	}


