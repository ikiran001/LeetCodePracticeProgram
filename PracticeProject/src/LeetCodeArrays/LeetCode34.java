package LeetCodeArrays;

import java.util.Arrays;
//====================unresolved==============
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//34. Find First and Last Position of Element in Sorted Array


public class LeetCode34 {

	public static void main(String[] args) {

		int [] nums={1,4};

		int target=4;
		searchRange(nums, target);
		System.out.println(Arrays.toString(searchRange(nums, target)));

	}
	static int[] searchRange(int[] nums, int target) {
		
		int[] arr=new int[2];
		
		if(nums.length==0)
		{
			arr[0]=-1;
			arr[1]=-1;
			return arr;
		}
		int index=0;
		for (int i = 0; i < nums.length; i++) {
			if(target!=nums[i]) {
				arr[0]=-1;
				arr[1]=-1;

			}
			
		}
		if(nums.length==1) {
			if(nums[0]==target) {
				arr[0]=0;
				arr[1]=0;
				return arr;
			}
		}
		if(target==nums[0]) {
			arr[0]=0;
			arr[1]=0;
		}

		for (int i = 0; i < nums.length; i++) {
			if(target==nums[i]) {
				arr[index]=i;
				index++;

			}
			
		}

		return arr;

	}

}