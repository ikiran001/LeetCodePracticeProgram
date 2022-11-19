package LeetCodeArrays;

//https://leetcode.com/problems/rotate-array/
/*
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]*/
public class LeetCode189 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
rotate(arr, 1);
	}


	static void rotate(int[] nums, int k) {
		int[] arr=new int[nums.length];
		int n=nums.length-1;
		int index=0;
		while(k>0) {
			arr[index]=nums[n];
			for (int i = 0; i < nums.length-1; i++) {
				
				arr[i+1]=nums[i];
			}
			k++;
		}
System.out.println(arr);
	}



}