package Paterns;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patternStar(9)
;	}
	
	static void patternStar(int n) {
		int count=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				count++;
				System.out.print(count+" ");
			}
			count=0;
			System.out.println();
		}
	}

}
