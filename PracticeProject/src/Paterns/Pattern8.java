package Paterns;

public class Pattern8 {

	public static void main(String[] args) {
		starPattern(6);

	}
	static void starPattern(int n) {
		for (int i = 1; i <=n; i++) {
			int spaces=n-i-1;
			for (int j = spaces; j >=0; j--) {
				System.out.print(" ");
			}
			for (int j =1 ; j <=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


}
