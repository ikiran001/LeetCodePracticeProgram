package LeetCodeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//issue
//448. Find All Numbers Disappeared in an Array
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class LeetCode448 {

	public static void main(String[] args) {
		int[] arr= {4,3,2,7,8,2,3,1}; 
		System.out.println( "ans= "+findDisappearedNumbers(arr));



	}

	static List<Integer> findDisappearedNumbers(int[] nums) {
		Arrays.sort(nums);
		List<Integer> list=new ArrayList<>();
		int value=1;
		int[] arr= new int[nums.length];	
		for (int i = 0; i < arr.length; i++) {
			arr[i]=value;
			value++;
		}
		return list;
		


	}
}
