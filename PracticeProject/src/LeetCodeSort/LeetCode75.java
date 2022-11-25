package LeetCodeSort;

import java.util.Arrays;

//75. Sort Colors
//https://leetcode.com/problems/sort-colors/
public class LeetCode75 {

	public static void main(String[] args) {
		int[] arr= {2,0,2,1,1,0};
		sortColors(arr);
System.out.println(Arrays.toString(arr));
	}
	static void sortColors(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length-i; j++) {//right side sorted hence length-1
				if(nums[j]<nums[j-1]) {
					swap(nums, j-1, j);
				}
			}
		}
	} 


	static void swap(int[] arr,int first, int second) {
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}


}
