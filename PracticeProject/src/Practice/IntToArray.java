package Practice;

import java.util.Arrays;

public class IntToArray {

	public static void main(String[] args) {
		int n=1239;
		System.out.println(Arrays.toString(	intToArray(n)));

	}
	static int[] intToArray(int n) {
	
		
		int length=(int) (Math.log10(n)+1); 
		int[] arr=new int[length];
		int arrLength=arr.length;
		/*
		 * if (n%10==9) { arrLength= arrLength+1; }
		 */
		for (int i = arrLength; i >0 ; i--) {

			int sum=0;
			while(n>0) {
				sum=n%10;
				arr[i-1]=sum;
				n=n/10;
				break;

			}
		}	
		return arr;
	}

}
