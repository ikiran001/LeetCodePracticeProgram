package LeetCodeSort;

import java.util.Arrays;

public class LeetCode645 {

	public static void main(String[] args) {
		int[] arr= {1,3,4,3};
		System.out.println(Arrays.toString(findErrorNums(arr)));
	}
	public static int[] findErrorNums(int[] nums) {
		int[] arr=new int[2];
		cyclicSort(nums);
		System.out.println(Arrays.toString(nums));

		for (int index = 0; index < nums.length; index++) {
			if(nums[index]!=index+1) {
				arr[0]=nums[index];
				arr[1]=index+1;
			}
		}
		return arr;
	}

	static void cyclicSort(int [] nums) {
		int i=0;
		while(i<nums.length) {
			int correct =nums[i]-1;
			if(nums[i]!=nums[correct]) {
				swap(nums, i, correct);
			}
			else {
				i++;
			}
		}
	}

	static void swap(int[] nums, int first, int second) {
		int temp=nums[first];
		nums[first]=nums[second];
		nums[second]=temp;

	}
}
