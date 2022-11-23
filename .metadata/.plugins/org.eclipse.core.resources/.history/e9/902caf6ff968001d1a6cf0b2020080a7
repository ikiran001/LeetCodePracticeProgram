package BinarySearch;

public class LeetCode_RotatedBinaryDuplicate {

	public static void main(String[] args) {
		int[] arr= {4,5,6,7,1,1,3};
		System.out.println(roratedBinaryWithDuplicate(arr));
	}

	static int roratedBinaryWithDuplicate(int [] arr) {
		int start=0;
		int end =arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(mid<end && arr[mid]>arr[mid+1]) {
				return mid;
			}
			if(mid>start && arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			//if the elements are at middle ,start and end are equal then just skip the duplicates
			if(arr[start]==arr[mid] && arr[mid]==arr[end]) {
				//but what if element are at start and end were the pivots?
				//check it for the pivots then skip it

				//check if start is pivot
				if(arr[start]>arr[start+1]) {
					return start;
				}
				start++;

				//check if end is pivot
				if(arr[end]>arr[end-1]) {
					return end;
				}
				end--;
			}
			//left side is sorted , we have check in right side
			else if(arr[start]==arr[mid] || (arr[mid]==arr[start] && arr[mid]>arr[end])) {
				start=mid+1;
			}
			else {
				end =mid-1;
			} 



		}
		return -1;
	}

}
