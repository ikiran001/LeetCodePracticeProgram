package demo.java;

public class IntValueSep {

	public static void main(String[] args) {
		int no = 123123;

		int temp = 0;
		int sum = 0;
		while (no != 0) {
			temp = no % 10;
			no = no / 10;
			sum = sum + temp;
		}
		System.out.println(" Sum : " + sum);

	}

}
