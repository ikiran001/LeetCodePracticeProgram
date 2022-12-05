package Recursion;

public class BinarySearchRecursion {

	public static void main(String[] args) {
		int[] aa= {1,2,3,5,6,7,34,43,56,};
		System.out.println(binarySearchRecursion(aa, 56, 0, aa.length-1));
	}

	static int binarySearchRecursion(int[] arr, int t, int s, int e) {
		if(s>e) {
			return -1;
		}
		int m= s+(e-s)/2;
		if(t>arr[m]) {
			return binarySearchRecursion(arr, t, m+1, e);
		}
		else if(t<arr[m]) {
			return binarySearchRecursion(arr, t, s, m-1);
		}
		else {return m;}

	}

}
