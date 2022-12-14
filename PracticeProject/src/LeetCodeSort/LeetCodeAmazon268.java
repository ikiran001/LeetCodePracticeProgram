package LeetCodeSort;

//find the missng [0-n]
public class LeetCodeAmazon268 {

	public static void main(String[] args) {

		int[] arr= {2,0,1};
		System.out.println(missingNUmber(arr));
	}
	public static int missingNUmber(int [] nums) {
		sort(nums);

		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=i) {
				return i;
			}
		}
		return nums.length;
	}


	static void sort(int[] nums) {
		int i=0;
		while(i<nums.length) {
			int correct=nums[i];
			if(nums[i]<nums.length && nums[i]!=nums[correct]) {
				
				swap(nums, i,correct);
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
