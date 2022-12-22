package LeetCodeArrays;

public class LeetCode27 {

	public static void main(String[] args) {
		int[] arr= {0,1,2,2,3,0,4,2};
		int val=2;
		int  ans=removeElement(arr, val);
		System.out.println(ans);
	}

	public static int removeElement(int[] nums, int val) {
		int i=0;
		int count=0;
		for (int j = 0; j < nums.length; j++) {
			if(nums[j]==val) {
				count++;
			}
		}
		int n=nums.length-1;
		while(i<=n) {
			if(nums[i]==val) {
				if(nums[n]!=val) {
					swap(nums,i,n);
					n--;
					i++;
				}
				else {n--;}
			}
			else {
				i++;
			}
		}
		return nums.length-count;
	}

	private static void swap(int[] nums, int i, int n) {
		int temp=nums[i];
		nums[i]=nums[n];
		nums[n]=temp;

	}

}
