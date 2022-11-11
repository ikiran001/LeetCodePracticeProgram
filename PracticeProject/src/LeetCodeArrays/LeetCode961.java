package LeetCodeArrays;
//https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
/*
You are given an integer array nums with the following properties:

nums.length == 2 * n.
nums contains n + 1 unique elements.
Exactly one element of nums is repeated n times.
Return the element that is repeated n times.*/


public class LeetCode961 {

	public static void main(String[] args) {
		int[] arr= {2,1,2,5,3,2};
		System.out.println(repeatedNTimes(arr));

	}
	static int repeatedNTimes(int[] nums) {
		int ans=nums.length/2;

		for (int i = 0; i < nums.length; i++) {
			int count=0;
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]==nums[j]) {
					count++;
					if(count==ans-1) {
						return nums[i];
					}
				}
			}
		}
		return -1;
	}

}
