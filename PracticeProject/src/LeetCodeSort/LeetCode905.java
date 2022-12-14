package LeetCodeSort;

import java.util.Arrays;

//https://leetcode.com/problems/sort-array-by-parity/
//905. Sort Array By Parity Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
//Return any array that satisfies this condition.
//Input: nums = [3,1,2,4]
//Output: [2,4,3,1]
public class LeetCode905 {

	public static void main(String[] args) {
		int[] arr= {3,1,2,4};
		System.out.println(Arrays.toString(sortArrayByParity(arr)));
	}

	static int[] sortArrayByParity(int[] nums) {
		
		int [] arr=new int[nums.length];
		int index=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]%2==0) {
				arr[index]=nums[i];
				index++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]%2==1) {
				arr[index]=nums[i];
				index++;
			}
		}
		return arr;
	}
}
