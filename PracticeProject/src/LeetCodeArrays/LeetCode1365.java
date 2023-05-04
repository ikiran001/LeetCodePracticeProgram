package LeetCodeArrays;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

/*Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
Return the answer in an array*/


import java.util.Arrays;
import java.util.HashMap;

public class LeetCode1365 {

	public static void main(String[] args) {

		int[] nums= {8,1,2,2,3};
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
	}

	static int[] smallerNumbersThanCurrent(int[] nums) {
		HashMap<String, String>asd=new HashMap<>();
	
		int[] result=new int[nums.length]; 
		for (int i = 0; i < nums.length; i++) {
			int count=0;
			for (int j = 0; j < nums.length; j++) {
				if(nums[i]>nums[j]) {
					count++;
					result[i]=count;
				}

			}
			
		}
		return result;
	}

}
