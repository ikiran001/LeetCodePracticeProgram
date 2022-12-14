package Maze;

public class MazeProblem {

	public static void main(String[] args) {
		boolean[][] board= { {true,true,true}
		                     ,{true,true,true}
	                         ,{true,true,true}   };

		mazePath(board, "", 0, 0);
	}

	public static void mazePath(boolean[][] arr, String p, int r, int c) {
		if(r==arr.length-1 && c==arr[0].length-1) {
			System.out.println(p);
			return;
		}

		if(!arr[r][c]) {
			return;
		}

		arr[r][c]=false;

		if(r<arr.length-1) {
			mazePath(arr, p+'R', r+1, c);
		}
		if(c<arr[0].length-1) {
			mazePath(arr, p+'D', r, c+1);
		}
		if(r>0) {
			mazePath(arr, p+'L', r-1, c);
		}
		if(c>0) {
			mazePath(arr, p+'U', r, c-1);
		}

		arr[r][c]=true;
	}



}
