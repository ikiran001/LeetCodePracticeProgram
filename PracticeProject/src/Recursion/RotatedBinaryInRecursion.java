package Recursion;

public class RotatedBinaryInRecursion {

	public static void main(String[] args) {
		int[] a= {5,6,7,8,9,1,2,3,4};
	
		System.out.println(binarySearch(a, 4, 0, a.length-1));
	}
	public static int binarySearch(int[] arr, int target, int start, int end) {

		while(start<=end) {
			if(start>end) {
				return -1;
			}

			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				return mid;

			}
			if(arr[start]<=arr[mid]) {
				if(target<=arr[mid] && target>=arr[start]) {
					return binarySearch(arr, target, start, mid-1);	
				}
				return binarySearch(arr, target, mid+1, end);
			}
			else {if(target>arr[mid] && target<arr[end]) {


				return binarySearch(arr, target, mid+1, end); 
			}
			else return binarySearch(arr, target, start, mid-1);
			}

		}
		return -1;
	}
	 

}