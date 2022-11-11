package LeetCodeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/spiral-matrix/
/*
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]*/

//-------------------------------------------------unsolved----------------------------------------------
public class LeetCode54 {

	public static void main(String[] args) {

int[][] arr= {
		{1,2,3},
		{4,5,6},
		{7,8,9}
};

spiralOrder(arr);
System.out.println(Arrays.toString(arr));
	}
	
	 static List<Integer> spiralOrder(int[][] matrix) {
     	List<Integer> list=new ArrayList<>();
		 for (int i = 0; i < matrix.length; i++) {

				for (int j = 0; j < matrix[i].length; j++) {
					while(i==0 && j<matrix[i].length-1) {
						list.add(matrix[0][j]);
					}
					 
	        }
				
	    }
		 return list;
}
}