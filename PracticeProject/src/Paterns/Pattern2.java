package Paterns;

public class Pattern2 {

	public static void main(String[] args) {
		patternStar(5);
	}
	static void patternStar(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
			System.out.print("*");	
			}
			System.out.println();
			
		}
		
	}
}
