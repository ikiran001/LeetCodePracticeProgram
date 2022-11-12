package LeetCodeArrays;
//sorting and raking arrays
import java.util.Arrays;

public class LeetCode1331 {

	public static void main(String[] args) {
		int[] arr= {37,12,28,9,100,56,80,5,12};

		System.out.println(Arrays.toString(arrayRankTransform(arr)));

	}
	static int[] arrayRankTransform(int[] arr) {
		int [] copy=Arrays.copyOf(arr, arr.length);

		int rank=1;
		Arrays.sort(arr);

		int[] arr1=new int[arr.length];
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1] ) {
				arr1[i]=rank;
				arr1[i+1]=arr1[i];

			}
			if(arr[i]<arr[i+1]) 
			{
				arr1[i]=rank;
				arr1[i+1]=rank+1;
				rank++;

			}

		}

		return arr1;
	}
}
