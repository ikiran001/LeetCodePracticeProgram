package LeetCodeSort;

//https://leetcode.com/problems/third-maximum-number/
//414. Third Maximum Number
//Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
public class LeetCode414 {

	public static void main(String[] args) {
		int[] arr= {1,2};
		System.out.println(thirdMax(arr));

	}

	static int thirdMax(int[] nums) {
		selectionSort(nums);

		int index=1;
		int min=nums[nums.length-1];
		for (int i = nums.length-1; i >0; i--) {
			if(nums[i]>nums[i-1]) {
				min=nums[i-1];
				index++;
				if(index==3) {
					return min;
				}
			}
		}
		return nums[nums.length-1];

	}

	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int lastIndex=arr.length-i-1;
			int maxIndex=getMaxIndex(arr,0,lastIndex);
			swap(arr, lastIndex, maxIndex);
		}
	}

	static int getMaxIndex(int[] arr, int start, int end) {
		int max=start;
		for (int j = 0; j <=end; j++) {
			if(arr[j]>arr[max]) {
				max=j;
			}
		}
		return max;
	}

	static void swap(int[] arr,int first,int second) {
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
}






