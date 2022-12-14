package BinarySearch;



public class LeetCode_Hard_1095 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,3,1};
		findInMountainArray(arr, 3);
		System.out.println(findInMountainArray(arr, 5));

	}
	static int findInMountainArray(int[] nums , int target) {
		int peak=peakEle(nums);
		int firstTry=orderAgnosticBinarySearch(nums, target, 0, peak);
		if(firstTry!=-1) {
			return firstTry;
		}
		else 
			return 	orderAgnosticBinarySearch(nums, target, peak+1, nums.length-1);
	}

	static int peakEle(int[] nums) {
		int start=0;
		int end =nums.length-1;

		while(start<end) {
			int mid=start+(end-start)/2;
			if(nums[mid]>nums[mid+1]) {
				end=mid;

			}
			else {
				start=mid+1;
			}
		}
		return start;
	}


	static int orderAgnosticBinarySearch(int[] nums, int target,int start ,int end) {

		boolean isAsc=nums[start]<nums[end];

		while(start<=end) {
			int mid=start+(end-start)/2;
			if(nums[mid]==target) {
				return mid;
			}

			if(isAsc) {
				if(target>nums[mid]) {
					start=mid+1;
				}
				else {
					end=mid-1;
				}
			}
			else {
				if(target>nums[mid]) {
					end=mid-1;
				}
				else {
					start=mid+1;
				}
			}

		}
		return -1;
	}
}
