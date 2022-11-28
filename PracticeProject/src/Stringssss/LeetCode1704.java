package Stringssss;

public class LeetCode1704 {

	public static void main(String[] args) {
String a="textbook";
System.out.println(halvesAreAlike(a));

	}
	static boolean halvesAreAlike(String s) {
		int n=s.length();
		int count1=0;
		int count2=0;
		for (int i = 0; i < n/2; i++) {

			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
					s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
				count1++;
			}
		}
		
		for (int i = n/2; i < n; i++) {

			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
					s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
				count2++;
			}
		}
		
		if(count1==count2) {
			return true;
		}
		return false;
	}
}
