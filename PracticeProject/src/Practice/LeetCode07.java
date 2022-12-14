package Practice;
//https://leetcode.com/problems/reverse-integer/
//7. Reverse Integer
public class LeetCode07 {

	public static void main(String[] args) {
		int x=964632435;
		System.out.println(reverse(x));
	}

	static int reverse(int x) {
		if(x<Math.pow(2, 31)) {
			if(x<0) {
				x*=-1;
				return -1*reverseFunction(x);
			}
			else {
				return reverseFunction(x);
			}
		}
		return 0;

	}

	static int  reverseFunction(int x) {
		String a=String.valueOf(x);
		char []b =a.toCharArray();
		String c="";
		for (int i = b.length-1; i >=0; i--) {
			c+=b[i];
		}
		return Integer.valueOf(c);
	}
}
