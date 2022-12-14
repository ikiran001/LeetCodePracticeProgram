package LeetCodeSort;

import java.util.Arrays;

public class LeetCode41 {

	public static void main(String[] args) {
		int[] arr= {7,8,9,11,12};
		System.out.println(firstMissingPositive(arr));
	}
	

	static int firstMissingPositive(int[] nums) {
		sort(nums);
		System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=i+1) {
				return i+1;
			}
		}
		return nums[nums.length-1]+1;
	}

	
	
	static void sort(int[] nums) {
		int i=0;
		while(i<nums.length) {
			int correct = nums[i]-1;
			if(nums[i]<nums.length && nums[i]>0 && nums[i]!=nums[correct]) {
				swap(nums, i, correct);
			}
			else {i++;}
		}
	}

	
	static void swap(int[] nums, int first, int second) {
		int temp=nums[first];
		nums[first]=nums[second];
		nums[second]=temp;

	}

}
