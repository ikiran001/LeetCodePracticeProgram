package Stringssss;

public class LeetCode316 {

	public static void main(String[] args) {
String a="ccbc";
System.out.println(removeDuplicateLetters(a));
	}

	public static String removeDuplicateLetters(String s) {
		int n=s.length();
		int i=0;
		String ans="";
		while(i<n) {
			if(!(s.substring(i)).contains(String.valueOf(s.charAt(i)))) {
			ans+=s.charAt(i);
			i++;
			}
			else {
				i++;
			}
		}
		return ans;
	}

}
