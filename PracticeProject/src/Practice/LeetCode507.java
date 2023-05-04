package Practice;

public class LeetCode507 {

	public static void main(String[] args) {
		System.out.println(checkPerfectNumber(24));

	}

	public static boolean checkPerfectNumber(int num) {
		if(num % 2 != 0){
			return false;
		}
		int sum=0;
		for (int i = 1; i <= num/2; i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		return sum==num;
	}

}
