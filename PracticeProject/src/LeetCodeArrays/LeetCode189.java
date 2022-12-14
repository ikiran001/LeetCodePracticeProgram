package LeetCodeArrays;

import java.util.Arrays;

//https://leetcode.com/problems/rotate-array/
/*
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]*/
public class LeetCode189 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		rotate(arr, 101);
		System.out.println(Arrays.toString(arr));
	}


	static void rotate(int[] nums, int k) {
		k=k%nums.length;
		if(k < 0){ 
			k += nums.length;
		}
		reverseArray(nums, 0, nums.length-1);
		reverseArray(nums, 0, k-1);
		reverseArray(nums, k, nums.length-1);

	}

	static void reverseArray(int[] nums, int li , int ri) {
		while(li<ri) {
			int temp=nums[li];
			nums[li]=nums[ri];
			nums[ri]=temp;
			li++;
			ri--;
		}
	}


}
