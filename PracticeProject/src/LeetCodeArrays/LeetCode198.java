package LeetCodeArrays;

public class LeetCode198 {

	public static void main(String[] args) {
		int[] arr= {4,1,1,4};
		System.out.println( rob(arr));
	}

	static int rob(int[] nums) {
        int res[] = new int[nums.length+1];
        res[0]=0;
        res[1]=nums[0];
        for(int i=1;i<nums.length;++i){
            res[i+1]=Math.max(res[i],res[i-1]+nums[i]);
        }
        return res[nums.length];
    }}

