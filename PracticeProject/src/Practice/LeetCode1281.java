package Practice;
//1281. Subtract the Product and Sum of Digits of an Integer
//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
public class LeetCode1281 {

	public static void main(String[] args) {
		int a=123456789;
		System.out.println(subtractProductAndSum(a));
	}

	static int subtractProductAndSum(int n) {
		int product=1;
		int a=n+0;
		while(n>0) {
			int b=n%10;
			product*=b;
			n=n/10;
		}
		return product-sum(a);

	}

	static int sum(int n) {
		int sum=0;
		while(n>0) {
			int b=n%10;
			sum+=b;
			n=n/10;
		}
		return sum;
	}

}
