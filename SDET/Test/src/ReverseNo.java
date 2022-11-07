public class ReverseNo {

	public static int reversNo(int no) {
		int reversed = 0;

		while (no != 0) {
			System.out.println("Ent No :"+no);
			int digit = no % 10;
			System.out.println("digit :" + digit);
			reversed = reversed * 10 + digit;
			System.out.println("reversed :" + reversed);
			no = no / 10;
			System.out.println("no :" + no);
			System.out.println("================");
		}

		return reversed;
	}

	public static void main(String[] args) {
		int a = 34525;
		System.out.println("reversNo : " + reversNo(a));

	}

}
