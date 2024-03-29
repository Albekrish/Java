package leetcode;
//Using recursion
public class RotateImage {

	public static void main(String[] args) {
		int matrix[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		   int row=matrix.length,col=matrix.length-1;
	        for(int i=0;i<row;i++)
	        {
	            for(int j=i;j<col-i;j++)
	                rotateArray(i,j,j,col-i,col,matrix,matrix[i][j]);
	            row--;
	        }
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++){ 
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	 public static void rotateArray(int s_row,int s_col,int i,int j,int col,int[][] matrix,int temp)
	    {
	        if(i==s_row && j==s_col)
	        {
	            matrix[i][j]=temp;
	            return;
	        }
	        rotateArray(s_row,s_col,j,col-i,col,matrix,matrix[i][j]);
	        matrix[i][j]=temp;
	    }
}
