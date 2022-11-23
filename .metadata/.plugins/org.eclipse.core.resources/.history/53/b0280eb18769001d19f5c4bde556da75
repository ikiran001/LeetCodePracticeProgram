package BinarySearch;
//issue
public class LeetCode287 {

	public static void main(String[] args) {
		int[] arr= {1,3,4,2,2};
		System.out.println(findDuplicate(arr));

	}
	static int findDuplicate(int[] nums) {
		int start=nums[0];
		int end=nums.length-1;
		while(start<=end){
			int mid=start+(end-start)/2;
			if(nums[start]==nums[mid] || nums[mid]==nums[end]) {
				return mid;
			}
			else {
				start++;
			}
		}
		return -1;
	}
}



