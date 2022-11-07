public class SumOfTwo {

	public static int[] sum(int numArr[], int num) {
		int sumNumbers[] = new int[2];
		int sumNumbers1[] = new int[2];
		for (int i = 0; i < numArr.length; i++) {

			for (int j = i + 1; j < numArr.length; j++) {

				if (numArr[i] + numArr[j] == num) {
					// System.out.println("i+j  : " + i + j);

					sumNumbers[0] = numArr[i];
					sumNumbers[1] = numArr[j];
				}

			}

		}

		return sumNumbers;
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 5 };
		int[] sumnumbers2= sum(a, 4);
		for (int i : sumnumbers2) {
			System.out.println(i);
		}

	}
}
