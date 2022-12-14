package BinarySearch;
//https://leetcode.com/problems/sqrtx/
/*Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.*/

public class LeetCode69 {

	public static void main(String[] args) {
		int[] arr= {0,1,2,3,4,5,6,7,8};
System.out.println(mySqrt(8));
	}
	static int mySqrt(int x) {
		long start=0;
		long end=x;
		long ans=0;
		while(start<=end){
			long mid=start+(end-start)/2;
			if(mid*mid>x) {
				end=(int) (mid-1);
				ans=(int) mid;

			}
			else if(mid*mid<x) {
				start=(int) (mid+1);
				
			}
			else {
				return  (int) mid;
			}
		}
		return (int) ans-1;

	}

}
