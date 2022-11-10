package LeetCodeArrays;

import java.util.Arrays;

//https://leetcode.com/problems/plus-one/

/*
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4]*/
public class LeetCode66 {

	public static void main(String[] args) {
		int[] arr= {1,2,3};
		System.out.println(Arrays.toString(plusOne(arr)));
	}

	static int[] plusOne(int[] digits) {
	
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}

		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;}
}
















