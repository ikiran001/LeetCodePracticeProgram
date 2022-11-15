package LeetCodeArrays;

import java.util.Arrays;

public class LeetCode167 {

	public static void main(String[] args) {
		int [] nums= {1,2,3,4,9};
		System.out.println(Arrays.toString(twoSum(nums, 6)));

	}
	static  int[] twoSum(int[] numbers, int target) {
		int [] arr=new int[2];
		int i=0;
		int j = numbers.length-1;
		while(true) {
			if(numbers[i]+numbers[j]==target) {
				arr[0]=i+1;
				arr[1]=j+1;
				break;
			}
			else if(numbers[i]+numbers[j]>target) 
				j--;
			
			else
				i++;
		}
		
		return arr;
	}
}
