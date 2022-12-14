package BinarySearch;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
//153. Find Minimum in Rotated Sorted Array
public class LeetCode153 {

	public static void main(String[] args) {
		int[] arr= {4,5,6,7,0,1,2,3};
		System.out.println(findMin(arr));

	}

	static int findMin(int[] arr) {  
		int pivot=returnNUmber(arr);
		if(pivot==-1) {
			return arr[0];
		}
		else {	return pivot;}
	}


	static int returnNUmber(int[] nums) {
		int start=0;
		int end=nums.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;

			if(mid<end && nums[mid]>nums[mid+1]) {
				return nums[mid+1];
			}
			if(mid>start && nums[mid]<nums[mid-1]) {
				return nums[mid];
			}
			if(nums[start]>nums[mid]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}

}
