package LeetCodeArrays;
//https://leetcode.com/problems/relative-sort-array/
/*1122. Relative Sort Array
Easy
1990
114
Add to List
Share
Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.*/


import java.util.Arrays;

public class LeetCode1122 {

	public static void main(String[] args) {
		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
		int[] arr2 = {2,1,4,3,9,6};
		System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));

	}
	static int[] relativeSortArray(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		int index=0;
		int[] arr3=new int[arr1.length];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if(arr2[i]==arr1[j]) {
					arr3[index]=arr1[j];
					index++;

				}
			}
		}
		sort(arr3, arr1);
		int i=arr3.length-1;
		while(arr3[i]!=arr2[arr2.length-1] ) {
			if(arr3[i]<arr3[i-1]) {
				int temp=arr3[i];
				arr3[i]=arr3[i-1];
				arr3[i-1]=temp;

			}
			i--;
		}

		return arr3;

	}

	static int[] sort(int [] arr3, int []arr1) {
		int i=arr3.length-1;
		int j=arr1.length-1;

		while(arr3[i]==0) {
			arr3[i]=arr1[j];
			i--;
			j--;

		}
		return arr3;

	}
	}
