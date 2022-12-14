package LeetCodeArrays;
//gretest common devider

//https://leetcode.com/problems/find-greatest-common-divisor-of-array/
/*Input: nums = [2,5,6,9,10]
Output: 2
Explanation:
The smallest number in nums is 2.
The largest number in nums is 10.
The greatest common divisor of 2 and 10 is 2.*/


public class LeetCode1979 {

	public static void main(String[] args) {

		int[] arr= {6,7,8,9}; 	
		System.out.println(findGCD(arr));
	}
	static int findGCD(int[] nums) {
		int gcd=1;
		//	Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				int tmp = 0;  
				if (nums[i] > nums[j])   
				{  
					tmp = nums[i];  
					nums[i] = nums[j];  
					nums[j] = tmp;  
				}  
			}  

		}


		if(nums[0]%2==0 && nums[nums.length-1]%2==0) {
			return 2;
		}
		if(nums[0]%3==0 && nums[nums.length-1]%3==0) {
			return 3;
		}
		if(nums[0]%5==0 && nums[nums.length-1]%5==0) {
			return 5;
		}
		if(nums[nums.length-1]%nums[0]==0) {
			return nums[0];
		}
		else return gcd;

	}
	private int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}
}
