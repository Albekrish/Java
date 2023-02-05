package leetcode;
//463. Island Perimeter

public class NumberOfIsland {

	public static void main(String[] args) {
		int[][] grid= {{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0}};
		int count= 0;
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				if(grid[i][j]==1) {
					count += 1;
					callBfs(grid,i,j);
				}
				
				
			}
		}
		System.out.println(count);

	}
	
	public static void callBfs(int[][] grid, int row,int col) {
		if(row<0 || row>=grid.length || col<0 || col>=grid[row].length || grid[row][col] == 0) {
			return;
		}
		grid[row][col]=0;
		callBfs(grid, row-1,col);
		callBfs(grid,row+1,col);
		callBfs(grid, row,col-1);
		callBfs(grid, row,col+1);
	}

}
