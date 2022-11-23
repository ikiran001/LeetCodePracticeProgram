package BinarySearch;
//https://leetcode.com/problems/search-insert-position/
//35. Search Insert Position
//Input: nums = [1,3,5,6], target = 5
//Output: 2
public class LeetCode35 {

	public static void main(String[] args) {
int[] arr= {1,3,5,6};
System.out.println(searchInsert(arr, 5));

	}
	   static int searchInsert(int[] nums, int target) {
		   int start=0;
		   int end=nums.length-1;
		   while(start<=end) {
			   int mid=start+(end-start)/2;
			   if(target>nums[mid]) {
				   start=mid+1;
			   }
			   else if(target<nums[mid]) {
				   end=mid-1;
			   }
			   else return mid;
			   
		   }
		   return start;	   }
}
