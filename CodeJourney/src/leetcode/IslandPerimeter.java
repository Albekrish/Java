package leetcode;

public class IslandPerimeter {

	public static void main(String[] args) {
		int[][] grid= {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		
		int permeter = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    if(i==0 || grid[i-1][j] == 0) permeter++;
                    if(i==n-1 || grid[i+1][j] == 0) permeter++;
                    if(j==0 || grid[i][j-1] == 0) permeter++;
                    if(j==m-1 || grid[i][j+1] == 0) permeter++;
                }
            }
        }
       
        System.out.println(permeter);

	}

}
