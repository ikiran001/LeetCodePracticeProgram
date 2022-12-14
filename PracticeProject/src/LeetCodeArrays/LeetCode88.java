package LeetCodeArrays;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/
/*Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.*/

public class LeetCode88 {

	public static void main(String[] args) {
		int [] nums1= {0};
		int[] nums2= {1};
		merge(nums1, 0, nums2, 1);

	}

	static void merge(int[] nums1, int m, int[] nums2, int n) {
		int index=0;

		for (int i = m; i < m+n; i++) {
			nums1[i]=nums2[index];
			index++;
		}
		Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));
	}

}
