package BinarySearch;

public class OrderAgnosticBinarySearch {

	public static void main(String[] args) {
int []arr= {10,9,8,7,6,5,4,3,2,1};
System.out.println(orderAgnosticBinarySearch(arr, 9));

	}

	static int orderAgnosticBinarySearch(int[] nums, int target) 
	{
		int start=0;
		int end=nums.length-1;
		
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
