package BinarySearch;


public class LeetCode81 {

	public static void main(String[] args) {
		int[] arr= {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
		System.out.println(search(arr, 2));

	}
	static boolean search(int[] nums, int target) {
		if(findPivot(nums)==-1) {
			return binarySearch(nums, target, nums[0], nums.length-1);
		}
		int pivot=findPivot(nums);
		if(target==pivot) {
			return true;
		}
		else if(target>nums[0]) {
			return  binarySearch(nums, target, nums[0], pivot);

		}
		else {
			return 	binarySearch(nums, target, pivot+1,	 nums.length-1);
		}
	}

	static boolean binarySearch(int [] arr, int target , int start, int end) {
		if(arr.length==1) {
			if(start==target) {
				return true;
			}
			else return  false;
		}
		while(start<=end) {
			int mid=start+(end-start)/1;
			if(target<arr[mid]) {
				end=mid-1;
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}
			else {
				return true;
			}

		}		 
		return false;	 }

	static int findPivot(int[] arr) {
		int start=0;
		int end =arr.length-1;
		if(arr.length==1) {
			return arr[start];
		}
		while(start<end) {
			int mid=start+(end-start)/2;
			if(mid<end && arr[mid]>arr[mid+1]) {
				return mid;
			}
			else if(mid>start&& arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			else if(arr[mid]==arr[start] && arr[mid]==arr[end]) {
				if( arr[start]>arr[start+1]) {
					return start; 
				}
				start++;
				if(arr[end]>arr[end-1]) {
					return end;	 
				}
				end--;
			}
			else if(arr[start]==arr[mid] || arr[start]==arr[mid] && arr[mid]>arr[end]) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return -1;
	}

}
