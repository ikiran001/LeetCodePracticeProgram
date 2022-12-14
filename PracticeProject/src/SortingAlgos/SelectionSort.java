package SortingAlgos;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {5,-32,0,22,1,-54};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int lastIndex=arr.length-i-1;
			int maxIndex=getMaxIndex(arr,0,lastIndex);
			swap(arr, maxIndex, lastIndex);
		}
	}

	static int getMaxIndex(int[] arr, int start, int end) {
		int max=start;
		for (int i = 0; i <=end; i++) {
			if(arr[max]<arr[i]) {
				max=i;
			}
		}
		return max;
	}

	static void swap(int[] arr, int first,int second) {
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
}
