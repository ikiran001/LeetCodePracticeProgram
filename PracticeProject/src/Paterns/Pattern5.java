package Paterns;

public class Pattern5 {

	public static void main(String[] args) {

patternStar(10);
	}
	static void patternStar(int n) { 
		for (int i = 0; i < n/2; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for (int i = n/2-1; i >0 ; i--) {
			for (int j = 0; j < i; j++) {
				System.err.print("*"+" ");
			}
			System.out.println();
		}
		


	}
}
