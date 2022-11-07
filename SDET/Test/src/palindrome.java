public class palindrome {

	public static void main(String[] args) {

		int num = 323;
		int rev = 0;

		int temp = num;
		while (num != 0) {
			int a = num % 10;
			System.out.println("A : "+a);
			rev = (rev * 10) + a;
			num = num / 10;
		}
		System.out.println("num :" + num);
		System.out.println("rev :" + rev);
		if (temp == rev) {
			System.out.println("num p");
		} else {
			System.out.println("num NP");
		}
	}

}
