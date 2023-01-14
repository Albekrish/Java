package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//73. Set Matrix Zeroes

public class SetMatrixZero {

	public static void main(String[] args) {
		int[][] matrix= {{1,1,1},{1,0,1},{1,1,1}};
		boolean[] zeroRow=new boolean[matrix.length];
		boolean[] zeroColum=new boolean[matrix[0].length];
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j] == 0) {
					zeroRow[i]=true;
					zeroColum[j]=true;
				}
			}
		}

		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(zeroRow[i] || zeroColum[j]) {
					matrix[i][j]=0;
				}
			}
		}
		
		for(int[] row: matrix) {
			System.out.println(Arrays.toString(row));
		}
	}

}
