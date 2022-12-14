package Recursion;

public class RecursionWithArraysSorted {

	public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6,7,86,90};
	System.out.println(isSorted(arr, 0));
	}
	
	public static boolean isSorted(int [] n, int i) {
		if(i==n.length-1) {
			return true;
		}
		return n[i]<n[i+1] && isSorted(n, i+1);
	}

}
