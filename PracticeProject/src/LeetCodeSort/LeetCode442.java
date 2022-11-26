package LeetCodeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//442. Find All Duplicates in an Array
//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class LeetCode442 {

	public static void main(String[] args) {
int[] arr= {4,3,2,7,8,2,3,1};
System.out.println(findDuplicates(arr));

	}
	static List<Integer> findDuplicates(int[] nums) {
		cyclicSort(nums);
		System.out.println(Arrays.toString(nums));
		List<Integer>list= new ArrayList<>();
		
		for (int index = 0; index < nums.length; index++) {
			if(nums[index]!=index+1) {
				list.add(nums[index]);
			}
		}
	return list;
	}

	static void cyclicSort(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int correct=arr[i]-1;
			if(arr[i]!=arr[correct]) {
				swap(arr, i, correct);
			}
			else {i++;}
		}
	}


	static void swap(int[] arr, int first, int second) {
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}

}
