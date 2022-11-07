import java.util.ArrayList;
import java.util.List;

public class ArrAdd {

	public static List<Integer> add(int b[], int l) {

		List<Integer> ad = new ArrayList<Integer>();

		int sum =0;
		for (int i = 0; i < l; i++) {
			 sum = sum + b[i];
		 	System.out.println(b[i]);
			ad.add(sum);
		}
		return ad;
	}

	public static void main(String[] args) {

		int A[] = { 1, 2, 3, 4 };
		List<Integer> a = add(A, A.length);
		System.out.println(a);

	}

}
