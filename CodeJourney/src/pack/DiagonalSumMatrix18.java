/*18. Write a Program to Compute the Sum of Diagonals of a Matrix. For
example, for a 2 x 2 matrix, the sum of diagonal elements of the matrix
{1,2,3,4} will be equal to 5.

principal diagonal=a00+a11=> row=column
secondary diagonal=a01+a10=> row+column=n-1==>column=n-(row+1)
*/

package pack;

public class DiagonalSumMatrix18 {
	
	
	public static void sumOfDiagonal(int[][] maxt, int len) {
		int pd=0, sd=0;
		
		for(int i=0;i<len;i++) {			
			
			pd+=maxt[i][i];
			
			sd+=maxt[i][len-(i+1)];			
		}
		
		System.out.println("Sum of principal diagonal:"+pd);
		System.out.println("Sum of secondary diagonal:"+sd);
	}

	public static void main(String[] args) {
		
		int[][] a= {{1,2},
					{3,4}};
		int n=a.length;
		sumOfDiagonal(a,n);
	}

}
