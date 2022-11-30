package Stringssss;

public class LeetCode557 {

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}
	static String reverseWords(String s) {
		String b=" ";
		String[] a=s.split(" ");
		for (int i = 0; i <a.length; i++) {
			char[] c=a[i].toCharArray();  
			b+=" ";
			for (int j =  c.length-1; j >=0; j--) {
				b+=c[j];
			}
		}
		return b.trim();
	}

}
