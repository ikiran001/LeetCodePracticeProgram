package GeeksforGeeks;

import java.util.ArrayList;

public class GGReverseArrayIngroups {

	public static void main(String [] args) {
		int N = 5; int K = 3;
				int arr[] = {1,2,3,4,5};
		
			
	}
	static	void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
		
		int i=0;
		while (i <=k) {
			swap(arr, k, i);
			k--;
			i++;
		}

		while(k<=n) {
			System.out.println(k+" "+n);
			swap(arr, k, n);
			k++;
			n--;

		}
	} 
	public static void swap(ArrayList<Integer> arr, int a, int b) {
		System.out.println("BEfore swapping "+arr.get(a)+" "+arr.get(b));
		int temp=arr.get(a);
		
		int temp2=arr.get(b);
		arr.add(a, temp2);
		arr.add(b, temp);
		System.out.println(arr.get(a)+" "+arr.get(b));
	}

}
