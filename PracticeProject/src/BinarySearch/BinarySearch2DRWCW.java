package BinarySearch;

import java.util.Arrays;

public class BinarySearch2DRWCW {

	public static void main(String[] args) {  
		//sorted row wise and column wise
		int[][] arr=	{{10,20,30,40},
				         {15,25,35,45},
				         {28,29,37,49},
			           	 {33,34,38,50}};

		System.out.println(Arrays.toString(search(arr, 30)));
	}

	static int[] search(int[][] matrix, int target) {
		int row=0;
		int col=matrix[row].length-1;
		while(row<matrix.length && col>=0) {
			if(matrix[row][col]==target) {
				return new int[]{row,col};
			}
			else if(matrix[row][col]<target) { // if target is bigger then eliminate the row
				row++;
			}
			else  {                             // if element is bigger eliminate the column
				col--;
			}

		}

		return new int[] {-1,-1};
	}

}
