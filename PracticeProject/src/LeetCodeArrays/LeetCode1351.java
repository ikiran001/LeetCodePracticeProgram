package LeetCodeArrays;

public class LeetCode1351 {

	public static void main(String[] args) {

int [][] arr= {
		{4,3,2,-1},
		{3,2,1,-1},
		{1,1,-1,-2},
		{-1,-1,-2,-3}
};

countNegatives(arr);
System.out.println(countNegatives(arr));
	}

	
static int countNegatives(int[][] grid) {
int rows=grid.length;
int col=grid[rows].length-1;
int res=rows*col;

	int count=0;
	int a=0;
        for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if (grid[i][j]<0) {
					
					count++;
				}
				else if(grid[i][j]>0) {
					a++;
					if(res==a) {
						return 0;
					}
					 
				}
			}
		}
        return count;
    }
}
