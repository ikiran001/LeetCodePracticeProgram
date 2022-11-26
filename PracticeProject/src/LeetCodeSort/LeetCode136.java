package LeetCodeSort;

import java.util.Arrays;

public class LeetCode136 {

	public static void main(String[] args) {
		int[] arr= {0,1,1};
		System.out.println(singleNumber(arr));
	}
	
	static int singleNumber(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			int count=0;
			for (int j = 0; j < nums.length; j++) {
				if(nums[i]==nums[j]) {
					count++;
					if(count==2) {
						break;
					}
				}
			}
			if(count<2) {
				return nums[i];
			}
		}
		return -1;
	}
}
