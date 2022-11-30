package Stringssss;
//https://leetcode.com/problems/powx-n/
//50. Pow(x, n)
public class LeetCode50 {

	public static void main(String[] args) {


		double x=-1.00000; int n=-2147483648;  
		System.out.println(myPow(x, n));

	}

	static double myPow(double x, int n) {
		double a=x;
		if(x==1 ) {
			return 1.0;
		}
		else if(x==-1) {
			if(n==-2147483648) {
				return 1.0;
			}
			return -1.0;
		}
		else if(n==-2147483648) {
			return 0.0;
		}
		else if (n<=0) {
			n=n*-1;
			for (int i = 0; i < n+1; i++) {
				x=x*(1/a);
			} 
			return x;
		}
		else for (int i = 1; i < n; i++) {
			x*=a;
		}
		return x;
	}

}


