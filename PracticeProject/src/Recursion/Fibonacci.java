package Recursion;
// find the nth fibonacci number
// and find upto nth fibonacci numbers
public class Fibonacci {

	public static void main(String[] args) {
		int n=10;
		for (int i = 1; i <= n; i++) {
			System.out.println(fibo(i));
		}
	}
	static int fibo(int i) {
		if(i<2) {
			return i;
		}

		return fibo(i-1)+fibo(i-2);
	}
}
