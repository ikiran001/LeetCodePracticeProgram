package Stringssss;

public class LeetCode58 {

	public static void main(String[] args) {
		String s = "pooja paruasdasasdi";
		System.out.println(lengthOfLastWord(s));
	}


	static int lengthOfLastWord(String s) {
		String[] a=s.split(" ");
		String b=a[a.length-1];
		char[] c=b.toCharArray();
		return c.length;
	}
}
