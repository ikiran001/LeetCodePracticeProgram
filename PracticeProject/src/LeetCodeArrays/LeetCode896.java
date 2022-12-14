package LeetCodeArrays;
//https://leetcode.com/problems/monotonic-array/
/*
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise*/
/*//Input: nums = [1,2,2,3]
Output: true*/
/*
Example 2:

Input: nums = [6,5,4,4]
Output: true*/


public class LeetCode896 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		isMonotonic(arr);
		System.out.println(isMonotonic(arr));	
	}
	static boolean isMonotonic(int[] nums) {
		boolean inc=true;
		boolean dec=true;

		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]<nums[i+1]) {
				dec=false;
			}
			if (nums[i]>nums[i+1]) {
				inc=false;
			}

			if(inc==false && dec== false) return false;
		}
		return true;
	}
}
