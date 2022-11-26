package LeetCodeArrays;

import java.util.Arrays;

//https://leetcode.com/problems/rotate-array/
/*
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]*/
public class LeetCode189 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
rotate(arr, 5);
System.out.println(Arrays.toString(arr));
	}


	static void rotate(int[] nums, int k) {
		for (int i = 0; i < k; i++) {

		int lastElement=nums[nums.length-1];
		
		for (int j = nums.length-1; j >0; j--) {
			nums[j]=nums[j-1];
		}
		nums[0]=lastElement;
		}
		
	}



}
