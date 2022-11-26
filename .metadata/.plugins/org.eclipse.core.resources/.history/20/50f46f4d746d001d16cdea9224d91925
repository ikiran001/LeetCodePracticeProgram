package LeetCodeSort;
//https://leetcode.com/problems/find-the-duplicate-number/
//287. Find the Duplicate Number
import java.util.Arrays;

public class LeetCode287 {

	public static void main(String[] args) {
		int[] arr= {1,3,4,2,2};
System.out.println(findDuplicate1(arr));
	}
	static int findDuplicate(int[] nums) {
		Arrays.sort(nums);
		for (int i = 1; i < nums.length; i++) {
			if(nums[i]==nums[i-1] ) {
				return nums[i];
			}
		}
		return -1;
	}
	
	static int findDuplicate1(int[] nums) {
		int start=0;
		int end=nums.length-1;
		while(nums[start]!=nums[end]) {
			end--;
		}
		return nums[start];
	}
}
