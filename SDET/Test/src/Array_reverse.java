public class Array_reverse {

	public static void revArr(int arrNum[], int n) {

		int j = arrNum.length - 1;
		for (int i = 0; i < n / 2; i++) {
			int tmp = arrNum[i];
			arrNum[i] = arrNum[j - i];
			arrNum[j - i] = tmp;
		
		}
	//	System.out.println(arrNum[i]);

	}

	public static void main(String[] args) {

		int[] A = { 1, 2, 3, 4, 5 };
		revArr(A, A.length);

	}
}
