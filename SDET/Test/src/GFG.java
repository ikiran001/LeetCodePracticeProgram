import java.util.Arrays;

// Java program to update every array element with
// sum of previous and next numbers in array

class GFG {
	static int[] ReplaceElements(int arr[], int n) {

		int sum = 0;
		int a[] = new int[arr.length];
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
			a[i] = sum;

		}
		return a;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };
		int n = arr.length;
		int m[] = ReplaceElements(arr, n);
		System.out.println(Arrays.toString(m));

	}
}
