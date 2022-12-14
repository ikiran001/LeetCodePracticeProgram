package LeetCodeSort;

public class LeetCode268 {

	public static void main(String[] args) {
		int[] nums= {1,0,3};

		System.out.println(missingNumber(nums));
	}

	static int missingNumber(int[] nums) {
		bubbleSort(nums);

		if(nums[0]==0) {

			for (int i = 1; i < nums.length; i++) {
				if(nums[i]-nums[i-1]==2) {
					return nums[i-1]+1;
				}
			}}
		else {return 0;}
		return nums[nums.length-1]+1;
	}

	static void bubbleSort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length-i; j++) {
				if(nums[j]<nums[j-1]) {
					int temp=nums[j];
					nums[j]=nums[j-1];
					nums[j-1]=temp;
				}
			}
		}
	}

}
