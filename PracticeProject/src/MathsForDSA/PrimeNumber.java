package MathsForDSA;
//a number which is divisible by 1 and the number itself is prime number.
public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println(countPrimes(5000000));
	}


	static int countPrimes(int n) {
		int count=0;
		for (int i = 2; i < n; i++) {

			if(isPrime2(i)) {
				count++;
			}
		}
		return count;
	}

	//================================================

	public static boolean isPrime(int n) {
		for(int i=2 ; i<n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	//============================================================

	public static boolean isPrime2(int n) {
		if(n<=1) {
			return false;
		}
		int c=2;
		while(c*c<=n){
			if(n%c==0) {
				return false;
			}
			c++;
		}
		return true;
	}

}
