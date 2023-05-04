package LeetCodeArrays;

public class LeetCode1732 {

	public static void main(String[] args) {
	
	}

	 public static int largestAltitude(int[] gain) {
	        int [] arr=new int[gain.length+1];
	        arr[0]=0;
	        for (int i = 0; i < gain.length; i++) {
				arr[i+1]=arr[i]+gain[i];
			}
	        
	        return findMax(arr);
	    }
	 
	 public  static  int findMax(int[] nums) {
		 int max=nums[0];
		 for (int i = 0; i < nums.length; i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
		}
		 return max;
	 }
}
