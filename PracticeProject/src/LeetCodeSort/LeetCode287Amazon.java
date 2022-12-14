package LeetCodeSort;
//287. Find the Duplicate Number
//https://leetcode.com/problems/find-the-duplicate-number/
public class LeetCode287Amazon {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,2};
		System.out.println(findDuplicate(nums));
	}

	static int findDuplicate(int[] nums) {
		cyclickSort(nums);
		for (int index = 0; index < nums.length; index++) {
			if(nums[index]!=index+1) {
				return nums[index];
			}

		}
		return -1;
	}


	static void cyclickSort(int [] nums) {
		int i =0;
		while(i<nums.length) {
			int correct=nums[i]-1;
			if(nums[i]!=nums[correct]) {
				swap(nums, i, correct);
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
