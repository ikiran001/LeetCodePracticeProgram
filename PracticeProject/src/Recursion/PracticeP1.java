package Recursion;
//print up 
public class PracticeP1 {

	public static void main(String[] args) {

		numbers(1);
	}

	static void numbers(int n) {
		if(n==100) {
			System.out.print(n+" ");
			return;
		}
		System.out.print(n+" ");		numbers(n+1);
	}
}
