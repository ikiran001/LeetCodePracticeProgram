package LeetCodeSort;

public class LeetCode169 {

	public static void main(String[] args) {
		int[] arr= {1};

		System.out.println(majorityElement(arr));
	}
	static int majorityElement(int[] nums) {
		
		if(nums.length==1) {
			return nums[0];
		}

		sort(nums);

		int count=1;
		for (int i = 0; i < nums.length-1; i++) {

			if(nums[i]==nums[i+1] ) {
				count++;
				if(count>nums.length/2) {
					return nums[i];
				}
			}

		}
		return -1;
	}

	static void sort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length-i; j++) {
				if(nums[j]<nums[j-1]) {
					int temp=nums[j-1];
					nums[j-1]=nums[j];
					nums[j]=temp;
				}
			}
		}
	}
}
