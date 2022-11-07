public class MinMax {

	public static int Max(int a[]) {

		int Max = a[0];
		for (int i = 0; i < a.length; i++) {

			if (Max > a[i]) {
				Max = a[i];
			}
		}
		int secondMax = Integer.MIN_VALUE;
		//int secondMax = 0 ;
		for (int i = 0; i <= a.length-1; i++) {
			
			if (i != Max && secondMax < a[i]) {
				System.out.println(a[i]);
				secondMax = a[i];
			}
		}

		return secondMax;
	}

	public static void main(String[] args) {

		int[] A = { 5, 6, 9, 7, 3,8 };
		 Max(A);
		System.out.println(Max(A));

	}

}
