package LeetCodeArrays;

public class LeetCode55 {

	public static void main(String[] args) {
	int[] arr= {2,3,1,1,4};
	System.out.println(canJump(arr));

	}
	static boolean canJump(int[] nums) {
		int i=0;
		while(i<nums.length) {
			i=nums[i];
			
		}
		if(nums[i]==nums[nums.length-1]) {
			return true;
		}
		return false;
	}
}
