package LeetCodeArrays;
//https://leetcode.com/problems/binary-search/

/*Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4*/
import java.util.Arrays;

public class LeetCode_BS_704 {

	public static void main(String[] args) {

int[] arr= {-1,0,3,5,9,12};
System.out.println(search(arr, 9));
	}
	static int search(int[] nums, int target) {
		int start=0;
		int end = nums.length-1;

		Arrays.sort(nums);

		while(start<=end) {
			int mid =start+(end-start)/2;
			if(target>nums[mid]) {
				start=mid+1;
			}
			else if(target<nums[mid]) {
				end=mid-1;

			}
			else return mid;

		}
		return -1;
	}
}
