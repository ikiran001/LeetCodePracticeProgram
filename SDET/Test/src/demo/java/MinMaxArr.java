package demo.java;

public class MinMaxArr {

	public static int max(int no[]) {
		int temp = no[0];
		for (int i = 0; i < no.length; i++) {
			if (temp < no[i]) {
				temp = no[i];
			}

		}

		int SM = Integer.MIN_VALUE;
		for (int i = 0; i <= no.length - 1; i++) {
			if (no[i] != temp) {
				if (SM < no[i]) {
					SM = no[i];
				}

			}

		}
		return SM;
	}

	
	
	public static int min(int no[]) {
		int temp = no[0];
		for (int i = 0; i < no.length - 1; i++) {
			if (temp > no[i]) {
				temp = no[i];
			}
		}
		return temp;
	}

	public static void main(String[] args) {

		int arr[] = { 15,5, 6, 9, 7, 6, 3, 4, 11 };
		 System.out.println(" Min: " + min(arr));
		//System.out.println(" Max: " + max(arr));

	}

}
