package Practice;

import java.util.LinkedList;
import java.util.List;

public class IntLimit {

	public static void main(String[] args) {
		int [] num= {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
		System.out.println(addToArrayForm(num, 23));
	}
	public static List<Integer> addToArrayForm(int[] num, int k) {

		final LinkedList<Integer> result = new LinkedList<>();
		int len = num.length - 1;

		while(len >= 0 || k != 0){

			if(len >= 0){
				k += num[len--];
			}

			result.addFirst(k % 10);
			k /= 10;
		}

		return result;

	}
}
