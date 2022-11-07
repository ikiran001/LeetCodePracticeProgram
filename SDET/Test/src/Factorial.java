public class Factorial {

	public static long factorialWithLoop(int n) {
		long fact = 1;

		for (int i = 2; i <= n; i++) {
			fact = fact * i;
		}

		return fact;
	}

	public static long factorialWithRecursion(int n) {
		if (n <= 2) {
			return n;
		}
		return n * factorialWithRecursion(n - 1);
	}

	public static void main(String[] args) {

		// System.out.println("Factorial of 5 using loop is : "
		// + factorialWithLoop(5));

		System.out.println("Factorial of 10 using recursion is : "
				+ factorialWithRecursion(5));
	}

}
