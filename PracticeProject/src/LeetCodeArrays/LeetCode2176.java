package LeetCodeArrays;

public class LeetCode2176 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,1,2,2,2,1,3};
		int k=2;
		System.err.println(countPairs(arr, k));

	}
	public static int countPairs(int[] nums, int k) {
		int c=0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if((i*j)%2==0 && nums[i] == nums[j]) {
					c++;	
				}
			}
		}

		return c;
	}

}
