package Practice;

public class RecursionProductOfDigits {

	public static void main(String[] args) {
	int n=13456;
	System.out.println(prod(n));

	}
	public static int prod(int n) {
		if(n%10==n) {
			return n;
		}

		return (n%10)*prod(n/10);
	}
}
