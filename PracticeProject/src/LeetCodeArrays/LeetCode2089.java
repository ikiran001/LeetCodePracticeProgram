package LeetCodeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/find-target-indices-after-sorting-array/
/*
Input: nums = [1,2,5,2,3], target = 2
Output: [1,2]
Explanation: After sorting, nums is [1,2,2,3,5].
The indices where nums[i] == 2 are 1 and 2.*/
public class LeetCode2089 {

	public static void main(String[] args) {
int[] nums= {1,2,5,2,3};
targetIndices(nums, 2);
System.out.println(targetIndices(nums, 2));

	}
	 static List<Integer> targetIndices(int[] nums, int target) {
	   Arrays.sort(nums);
	   List<Integer> result=new ArrayList<>();
	        
	        for (int i = 0; i < nums.length; i++) {
				if( target==nums[i]) {
					result.add(i);
				}
			}
			return result;
	        
	    }
}
