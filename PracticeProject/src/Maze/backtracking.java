package Maze;

import java.util.Arrays;

public class backtracking {

	public static void main(String[] args) {
		boolean[][] board= { {true,true,true}
        ,{true,true,true}
        ,{true,true,true}   };
		int[][] arr=new int[board.length][board[0].length];
		mazePath(board, "", 0, 0, arr, 1);

	}

	public static void mazePath(boolean[][] arr, String p, int r, int c, int[][] path, int step) {
		
		if(r==arr.length-1  && c==arr[0].length-1) {
			path[r][c]=step;
			for(int[] nums :path) {
				System.out.println(Arrays.toString(nums));
			}
			System.out.println(p);
			System.out.println();
			return;
		} 


		if(!arr[r][c]) {
			return;
		}

		arr[r][c]=false;
		path[r][c]=step;
		
		if(r<arr.length-1) {
			mazePath(arr, p+'D', r+1, c, path, step+1);
		}		
		if(c<arr[0].length-1) {
			mazePath(arr, p+'R', r, c+1, path, step+1);
		}
		
		if(r>0) {
			mazePath(arr, p+'U', r-1, c, path, step+1);
		}
		if(c>0) {
			mazePath(arr, p+'L', r, c-1, path, step+1);
		}
		
		arr[r][c]=true;
		path[r][c]=0;
		
	}

}













