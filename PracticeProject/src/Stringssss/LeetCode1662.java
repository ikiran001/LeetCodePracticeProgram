package Stringssss;

public class LeetCode1662 {

	public static void main(String[] args) {
		String[] a= {"a","cb"};
		String[] b= {"ab","b"};
		System.out.println(arrayStringsAreEqual(a, b));

	}
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		return abc(word1).equals(abc(word2));
	}

	static String abc(String []a) {
		
		String b="";
		for (int i = 0; i < a.length; i++) {
			char[] g=a[i].toCharArray();
			for (int j = 0; j < g.length; j++) {
			b+=g[j];
			}
		}
		return b;
	}

}
