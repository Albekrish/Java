package abifirstevaluation;

import java.util.Arrays;

public class MatrixRotateMulti6 {	
	public static void main(String[] args)
	{
		MatrixRotateMulti6 obj=new MatrixRotateMulti6();
		int array[][]= {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};		
		int size=array.length;
		int length=array.length-1;
				
		for(int i=0;i<size/2;i++)
		{
			for(int j=0;j<size-(size/2);j++)
			{
				obj.helper(array,i,j,length-j,i,length,array[i][j]);
			}
		}
		for(int[] i:array)
		{
			System.out.println(Arrays.toString(i));
		}
	}
	
	void helper(int[][] array,int row,int col,int i,int j,int length,int value)
	{
		if(i==row&&j==col)
		{
			array[i][j]=value;
			return ;
		}
		helper(array,row,col,length-j,i,length,array[i][j]);	
		array[i][j]=value;
	}
}