package leetcode;
//54. Spiral Matrix
public class SpiralMatrix {
	public static void main(String[] args) {
		int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		
		int m=matrix.length;
		int n=matrix[0].length;
		int x=0, y=0;
		for(int i=0;i<m;i++) {
			System.out.print(matrix[x][y++]); //top->rit
		}
		for(int i=0;i<m;i++) {
			System.out.print(matrix[x++][y]); //top-bottom
		}
		for(int i=0;i<m;i++) {
			System.out.print(matrix[x][y--]);  //bottom-left
		}
		for(int i=0;i<m;i++) {
			System.out.print(matrix[x--][y]); //bottom right to top
		}

	}

}
