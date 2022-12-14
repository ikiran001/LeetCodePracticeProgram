package LeetCodeArrays;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
/*Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]*/
import java.util.Arrays;
//====================unresolved==============
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//34. Find First and Last Position of Element in Sorted Array


public class LeetCode34 {

	public static void main(String[] args) {

		int [] nums={5,7,7,8,8,10};

		int target=8;
		searchRange(nums, target);
		System.out.println(Arrays.toString(searchRange(nums, target)));

	}
	static int[] searchRange(int[] nums, int target) {
		int[] ans= {-1,-1};
		ans[0]=	search(nums, target, true);
		ans[1]=search(nums, target, false);
		return ans;

	}

	static int search(int[] nums, int target , boolean isStartIndexReq) {
		int ans=-1;
		int start=0;
		int end =nums.length-1;
		

		while(start<=end) {
			int  mid=start+(end-start)/2;
			if(target<nums[mid]) {
				end =mid-1;
			}
			else if(target>nums[mid]) {
				start=mid+1;
			}
			else {
				ans=mid;
				if(isStartIndexReq) {
					end=mid-1;

				}
				else {
					start=mid+1;
				}

			}
		}
		return ans;
	}


}
