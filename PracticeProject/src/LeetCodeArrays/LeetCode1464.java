package LeetCodeArrays;

public class LeetCode1464 {

	public static void main(String[] args) {
		int[] arr= {3,7};
		System.out.println(maxProduct(arr));
	}
	static int maxProduct(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]>nums[j]) {
					int temp= nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		int ele1=nums[nums.length-1]-1;
		int ele2=nums[nums.length-2]-1;

		return ele1*ele2;
	}
}
