package LeetCodeArrays;

public class LeetCode1394 {

	public static void main(String[] args) {
		int[] arr={2,2,2,3,3};
		findLucky(arr);
		System.out.println(findLucky(arr));
	}

	static int findLucky(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
		if(arr[i]==i)	{ 
			return i;	}
			
		}
		return -1;


	}
}

