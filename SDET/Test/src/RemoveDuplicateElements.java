public class RemoveDuplicateElements {

	public static int removeDuplicateElements(int arr[], int n) {

		if (n == 1 || n == 0) {
			return n;
		}

		// int temp[] = new int[n];
		int j = 0;

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}

		}
		arr[j++] = arr[n - 1];

		return j;

	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50 };
		int length = arr.length;

		int length1 = removeDuplicateElements(arr, length);

		System.out.println(length1);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
