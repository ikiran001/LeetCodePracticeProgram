package demo.java;

public class factorial {

	public static int fact(int no) {
		
		int fact=1;
		
		for (int i = 2; i <= no ; i++) {
	          fact = fact *i;
			 
		}
		
		return fact;
	}

	public static void main(String[] args) {

		int a = 5;
		// fact(a);
		System.out.println(fact(a));
	}
}
