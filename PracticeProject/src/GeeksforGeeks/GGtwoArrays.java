package GeeksforGeeks;

import java.util.Arrays;

public class GGtwoArrays {

	public static void main(String[] args) {
		long	A[] = {1,2,5,4,0};
		long	B[] = {2,4,5,0,1};

		System.out.println(check(A, B, 5));
	}
	public static boolean check(long A[],long B[],int N) {
		Arrays.sort(A);
		Arrays.sort(B);
		int i=0;
		while(i<N) {
			if(A[i]==B[i]) {
				i++;}
			else	return false;
		}
		return true;
	}

}
