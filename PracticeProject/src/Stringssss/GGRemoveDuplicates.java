package Stringssss;
import java.util.List;

//issue
public class GGRemoveDuplicates {

	public static void main(String[] args) {


	}
	public static void miniMaxSum(List<Integer> arr) {
		arr.sort(null);
		int minSum=0;
		int maxSum=0;
		/*
		 * for (int i = 0; i < arr.size(); i++) { for (int j = i; j < arr.size(); j++) {
		 * if(arr.get(i)>arr.get(j)) { swap(arr, i, j);
		 * 
		 * } } }
		 */

		for (int i = 0; i < arr.size()-1; i++) {
			minSum+=arr.get(i);
		}
		for (int i = 1; i < arr.size(); i++) {
			maxSum+=arr.get(i);
		}

		System.out.println(minSum+" "+maxSum);
	}

	public static void swap(List<Integer> arr, int a, int b) {
		int temp=arr.get(a);
		int temp2=arr.get(b);
		arr.add(a, temp2);
		arr.add(b, temp);

	}
}
