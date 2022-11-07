public class FizzBuzz {

	public static void fizzBuzz() {
		int count35 =0;
		int count3 =0;
		int count5 =0;
		
		for (int i = 1; i < 100; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				 count35++ ;
				System.out.println("FizzBuzz : "+i);
			} else if (i % 3 == 0) {
				System.out.println("Div by 3 : "+i);
				 count3++;
			} else if (i % 5 == 0) {
				System.out.println("Div by 5 : "+i);
				 count5++;
			}
		}
		
		System.out.println("count25 : "+count35);
		System.out.println("count3 : "+count3);
		System.out.println("count5 : "+count5);

	}

	public static void main(String[] args) {

		fizzBuzz();

	}

}
