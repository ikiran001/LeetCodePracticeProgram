package BinarySearch;

//ceiling = smallest number which is greater than or equal to target element

public class LeetCodeCeilingOfaNumbers {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,20,33,45,66,77,88,99};
		System.out.println(ceilingOfANum(arr, 34));

	}
	static int ceilingOfANum(int[] nums, int target) {
		int start=0;
		int end =nums.length-1;
 
		while(start<=end) {
			int mid=start+(end-start)/2;

			if(target>nums[mid]) {
				start=mid+1;
			}
			else if (target<nums[mid]){
				end=mid-1;
			}

			else return mid;


		}
		return nums[start];
	}

}
