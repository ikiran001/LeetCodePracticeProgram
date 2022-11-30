package Practice;
//9. Palindrome Number
//https://leetcode.com/problems/palindrome-number/
public class LeetCode9 {

	public static void main(String[] args) {
		int x = 121;
		System.out.println(isPalindrome(x));

	}
	
	
	static boolean isPalindrome(int x) {
	String a=String.valueOf(x);
		int i=0;
		int j=a.length()-1;
		while(i<=j) {

			if(a.charAt(i)==a.charAt(j)) {
				i++;
				j--;
			}
			else return false;
		}
		return true;
	}

}
