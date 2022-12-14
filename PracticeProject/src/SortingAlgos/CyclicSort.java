																package SortingAlgos;

import java.util.Arrays;

//best sortign algo for 1-n
public class CyclicSort {

	public static void main(String[] args) {
		int[] arr={5,4,3,2,1};
		cyclicSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	static void cyclicSort(int [] nums) {
		int i=0;
		while(i<nums.length) {
			int correct=nums[i]-1;
			if(nums[i]!=nums[correct]) {
				swap(nums,i,correct);
			}
			else {
				i++;
			}
		}
	}	
	static void swap(int[] nums, int first, int second) {
		int temp=nums[first];
		nums[first]=nums[second];
		nums[second]=temp;

	}
}
