package Paterns;

public class Pattern3 {

	public static void main(String[] args) {
	patternStar(6);
	}
	
	
	static void patternStar(int n) {
		for (int i = n; i >0; i--) {
			for (int j = i; j >0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
