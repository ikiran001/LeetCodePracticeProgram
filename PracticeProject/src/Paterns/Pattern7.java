package Paterns;

public class Pattern7 {

	public static void main(String[] args) {
patternStar(6);
	}
	static void patternStar(int n) { 
		for (int i = n; i >0; i--) {
			int spaces=n-i;
		for (int j = spaces; j >0; j--) {
			System.out.print(" ");
		}
		for (int j = i; j >0 ; j--) {
			System.out.print("*");
		}
		System.out.println();
		}
	}
}
