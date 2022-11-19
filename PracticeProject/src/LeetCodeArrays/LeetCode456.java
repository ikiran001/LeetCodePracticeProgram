package LeetCodeArrays;

public class LeetCode456 {

	public static void main(String[] args) {

		int[] num= {3,1,4,2};
		System.out.println(find132pattern(num));
	}

	static boolean find132pattern(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				for (int k = j+1; k < nums.length; k++) {
					if(i < j  && j < k && nums[i] < nums[k] && nums[k]< nums[j]) {
						return true;
					}
				}
			}
		}

		return false;
	}
}
