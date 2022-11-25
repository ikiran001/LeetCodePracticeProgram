package LeetCodeArrays;

import java.util.ArrayList;
import java.util.List;

public class LeetCode378 {

	public static void main(String[] args) {

int[][]arr={{1,5,9},{10,11,13},{12,13,15}};
System.out.println(kthSmallest(arr, 8));

	}
	
static int kthSmallest(int[][] matrix, int k) {
	
	List<Integer> list=new ArrayList<>();
        int count=0;
        for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				list.add(matrix[i][j]);
				count++;
				if(count==k) {
					
					return matrix[i][j];
				}
			}
		}
        return -1;
    }


}
