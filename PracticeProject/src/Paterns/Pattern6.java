package Paterns;

public class Pattern6 {

	public static void main(String[] args) {
		patternStar(5);

	}
	static void patternStar(int n) { 
		for (int i = 0; i < n; i++) {
			int spaces=n-i-1;
			for (int j = 0; j < spaces; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
