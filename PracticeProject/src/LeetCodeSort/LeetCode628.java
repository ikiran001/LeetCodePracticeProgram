package LeetCodeSort;

//https://leetcode.com/problems/maximum-product-of-three-numbers/
//628. Maximum Product of Three Numbers
//Input: nums = [1,2,3]
//Output: 6
public class LeetCode628 {

	public static void main(String[] args) {

		int[] arr= {-100,-2,-3,1};
		System.out.println(maximumProduct(arr));

	}

	static int maximumProduct(int[] nums) {
		selectionSort(nums);
		int n=nums.length-1;
		int ans=Integer.MIN_VALUE;
		ans=Math.max(nums[0]*nums[1]*nums[n],nums[n]*nums[n-1]*nums[n-2]);
		return ans;

	}

	static void selectionSort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int lastIndex=nums.length-i-1;
			int maxIndex=getMaxIndex(nums,0,lastIndex);
			swap(nums,lastIndex,maxIndex);
		}
	}

	static void swap(int[] nums, int lastIndex, int maxIndex) {
		int temp=nums[maxIndex];
		nums[maxIndex]=nums[lastIndex];
		nums[lastIndex]=temp;		
	}

	static int getMaxIndex(int[] nums, int start, int end) {
		int max=start;
		for (int i = 0; i <=end; i++) {
			if(nums[i]>nums[max]) {
				max=i;
			}
		}
		return max;
	}



}
