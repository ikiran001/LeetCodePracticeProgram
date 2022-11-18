package BinarySearch;
//852. Peak Index in a Mountain Array
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class LeetCode852_pivot {

	public static void main(String[] args) {
		int[] arr= {3,4,5,6,7,4,2,1};
System.out.println(peakIndexInMountainArray(arr));
	}
static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end =arr.length-1;
        while(start!=end) {
        int	mid=start+(end-start)/2;
        	if(arr[mid]>arr[mid+1]) {
        		end=mid;
        	}
        	else {
        		start=mid+1;
        	}
        	
        }
		return arr[end];
       
    }
}
