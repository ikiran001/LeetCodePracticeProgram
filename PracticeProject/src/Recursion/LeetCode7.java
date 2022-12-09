package Recursion;

public class LeetCode7 {

	public static void main(String[] args) {
		int a=-2147481;
		
		System.out.println(reverse(a));

	}

	public static int reverse(int x) {

		
		if(x<0 ) {
			x*=-1;
			return -1*reverseinteger(x);
		}

		if(x>=153423645)  return 0; 

		else {return reverseinteger(x);}
	}


	static int reverseinteger(int x) {
		int length=(int) Math.log10(x)+1;
		if(x%10==x) {
			return x;
		}
		int mod=x%10;
		return (int) ((mod*(Math.pow(10, length-1)))+reverseinteger(x/10));
	}

	

	static long reverseintegerLong(long x) {
		int length=(int) Math.log10(x)+1;
		if(x%10==x) {
			return x;
		}
		long mod=x%10;
		return (int) ((mod*(Math.pow(10, length-1)))+reverseintegerLong(x/10));
	}




}
