import java.util.Arrays;

public class RemvInt {

	public static void main(String[] args) {

		int a[] = { 1, 5, 6, 6, 9, 8, 7, 5, 5, 5 };
		int temp[] = new int[a.length];
		
		
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {

				temp[i] = a[i] + temp[i];
			}

			
			for (int num : a) {
			
			}
			
			 
		}

		System.out.println(Arrays.toString(temp));
	}

}
