package LeetCodeSort;

import java.util.Arrays;

//215. Kth Largest Element in an Array
//https://leetcode.com/problems/kth-largest-element-in-an-array/
public class LeetCode215 {

	public static void main(String[] args) {
		int[] arr= {3,2,3,1,2,4,5,5,6};
		int k=4;
		System.out.println(findKthLargest(arr, k));

	}

	static int findKthLargest(int[] nums, int k) {
		//insertionSort(nums);
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		int n=nums.length;
		int index=n-1;
		while(index>n-k) {
			index--;
		}
		return nums[index];

	}

	/*
	 * public static void insertionSort(int[] nums) { for (int i = 0; i <
	 * nums.length-1; i++) { for (int j = i+1; j >0; j--) { if(nums[j]<nums[j-1]) {
	 * swap(nums, j, j-1); } else { break; } } } }
	 * 
	 * static void swap(int[] nums, int a, int b) { int temp=nums[a];
	 * nums[a]=nums[b]; nums[b]=temp; }
	 */
}
