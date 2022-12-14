package LeetCodeArrays;
	//https://leetcode.com/problems/flipping-an-image/
/*
Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]*/
import java.util.Arrays;

public class LeetCode832 {

	public static void main(String[] args) {
		int [][] nums= {{1,0,0},
				{0,1,0},
				{1,1,1}};
		System.out.println(Arrays.toString(flipAndInvertImage(nums)));

	}
	static int[][] flipAndInvertImage(int[][] image) {


		for (int i = 0; i < image.length; i++) {
			int temp=0;
			for (int j = 0; j < image[i].length; j++) {
				int start=image[i][0];
				int end=image[i][image.length-1];
				while(start<end) {
					temp=start;
					start=end;
					end=temp;

					start++;
					end--;
				}

			}
			return image; 
		}
		return image;	
	
	}
}
