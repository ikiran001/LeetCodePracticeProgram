package LeetCodeArrays;

import java.util.Arrays;

//https://leetcode.com/problems/apply-operations-to-an-array/
//For example, the array [1,0,2,0,0,1] after shifting all its 0's to the end, is [1,2,1,0,0,0].


public class LeetCode2460 {

	public static void main(String[] args) {
		int[] nums= {847,847,0,0,0,399,416,416,879,879,206,206,206,272,847,847,0,0,0,399,416,416,879,879,206,206,206,272};
		Arrays.toString(applyOperations(nums));
		System.out.println(Arrays.toString(applyOperations(nums)));

	}
	static int[] applyOperations(int[] nums) {

		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]==nums[i+1]) {
				nums[i]*=2;
				nums[i+1]=0;
			}

		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length-1; j++) {

				if(nums[j]==0) {

					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;

				}	

			}
		}



		return nums;
	}
}
