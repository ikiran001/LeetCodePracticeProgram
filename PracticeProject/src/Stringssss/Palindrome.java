package Stringssss;

public class Palindrome {

	public static void main(String[] args) {
		String name="abcdcba";
		System.out.println(isPalindrome(name));
	}

	static boolean isPalindrome(String name) {
		for (int i = 0; i < name.length()/2; i++) {  // name.length()/2  cause it going to compare till mid element only
			int start=name.charAt(i);
			int end= name.charAt(name.length()-1-i);
			// name.length()== 7-1,, 
			//end=name.charAt(6) ==a;
			if(start!=end) {
				return false;
			}
		}
		return true;
	}
}
