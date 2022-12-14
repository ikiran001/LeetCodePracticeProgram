package LeetCodeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//issue
//448. Find All Numbers Disappeared in an Array
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class LeetCode448Google {

	public static void main(String[] args) {
		int[] arr= {1,9,7,6,5,3,2,4,5,13,13,13,13}; 
		System.out.println( "ans= "+findDisappearedNumbers(arr));
	}

	static List<Integer> findDisappearedNumbers(int[] nums) {
		cyclicSort(nums);
		System.out.println(Arrays.toString(nums));
		List<Integer> list=new ArrayList<>();
		for (int index = 0; index < nums.length; index++) {
			if(nums[index]!=index+1) {
				list.add(index+1);
			}
		}
		return list;
	}

	static void cyclicSort(int[] nums) {
		int i=0;
		while(i<nums.length) {
			int correct=nums[i]-1;
			if(nums[i]!=nums[correct]) {
				swap(nums , i, correct);
			}
			else {i++;}

		}
	}

	static void swap(int[] nums, int first, int second) {
		int temp=nums[first];
		nums[first]=nums[second];
		nums[second]=temp;

	}
}
