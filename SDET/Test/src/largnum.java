//WAP to find 2nd largest without any sorting technique

public class largnum {
	public static void main(String[] args) {
		int[] arr = { 2, 6, 5, 4 };
		int large =0;
		int slarge = 0;

		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] > large) {
				slarge = large;
				large = arr[i];
				
			} else if (arr[i] > slarge && arr[i] != large) {
				slarge = arr[i];
			}
		}
		System.out.println("large :"+large);
		System.out.println("slarge :"+slarge);
	}

}
