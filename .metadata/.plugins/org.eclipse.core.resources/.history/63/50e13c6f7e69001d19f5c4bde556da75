package BinarySearch;

public class LeetCode33_binary {

	public static void main(String[] args) {
		int []arr= {4,5,6,7,1,2,3};

		
		System.out.println(search(arr,3));

	}


	static int search(int[] nums, int target) {
		int pivot= findPivot(nums); //will return index of pivot

		//if you not found the pivot
		if(pivot==-1) {
			//means array is not rotated
			return binarySearch(nums, target, 0, nums.length-1);
		}

		//if pivot is found
		else	if(nums[pivot]==target) {
			return pivot;
		}

		else	if(target>=nums[0]) {
			return binarySearch(nums, target, 0, pivot-1);
		}
		else {
			return binarySearch(nums, target, pivot+1, nums.length-1);}


	}

	//simple binary search
	static int binarySearch(int [] arr,int target, int start , int end) {
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target>arr[mid]) {
				start=mid+1;
			}
			else if(target<arr[mid]) {
				end=mid-1;
			}
			else return mid;
		}
		return -1;
	}

	//find pivot
	static int findPivot(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;

			if(mid<end && arr[mid]>arr[mid+1]) {
				return mid;
			}
			else	if(mid>start && arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			else	if(arr[mid]<=arr[start]) {
				end=mid-1;
			}
			else {  //start<=mid
				start=mid+1; //{3,4,5,6,7,0,1,2}
			}
		}
		return -1;
	}

}
