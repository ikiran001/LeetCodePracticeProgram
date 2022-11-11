package LeetCodeArrays;

import java.util.Arrays;

public class LeetCode977 {

	public static void main(String[] args) {
		int[] arr= {-7,-3,2,3,11};
		sortedSquares(arr);
		System.out.println(Arrays.toString(sortedSquares(arr)));

	}
	static int[] sortedSquares(int[] nums) {
		int temp=0;
		int[] result=new int[nums.length];
		for (int i = 0; i < result.length; i++) {
			result[i]=nums[i]*nums[i];
		}

		for (int i = 0; i < result.length; i++) {
			for (int j = i+1; j < result.length-1; j++) {
				if(result[i]>result[j]) {
					temp=result[i];
					result[i]=result[j];
					result[j]=temp;
				}
			}
		}

		//Arrays.sort(result);
		return result;
	}
}
