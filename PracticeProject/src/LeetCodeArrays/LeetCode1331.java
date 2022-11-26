package LeetCodeArrays;
//issue
//sorting and raking arrays
import java.util.Arrays;

public class LeetCode1331 {

	public static void main(String[] args) {
		int[] arr= {37,12,28,9,100,56,80,5,12};

		System.out.println(Arrays.toString(arrayRankTransform(arr)));

	}
	static int[] arrayRankTransform(int[] arr) {
		//int [] nums=new int[arr.length];
		int n=arr.length;
		for (int i = 0; i < arr.length; i++) {
			int maxEl=max(arr, i, n-1);
		arr[maxEl]=n-1;
		n--;
		}	
		return arr;
	}


	static int max(int[] arr , int start, int end) {
		int max=start;
		for (int i = 0; i < arr.length; i++) {
			if(arr[max]<arr[i]) {
				max=i;
			}
		}
		return max;

	}


}
