package leetcode;
//54. Spiral Matrix
public class SpiralMatrix {
	public static void main(String[] args) {
		int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		
//		int m=matrix.length;
//		int n=matrix[0].length;
//		int x=0, y=0;
//		for(int i=0;i<m;i++) {
//			System.out.print(matrix[x][y++]); //top->rit
//		}
//		for(int i=0;i<m;i++) {
//			System.out.print(matrix[x++][y]); //top-bottom
//		}
//		for(int i=0;i<m;i++) {
//			System.out.print(matrix[x][y--]);  //bottom-left
//		}
//		for(int i=0;i<m;i++) {
//			System.out.print(matrix[x--][y]); //bottom right to top
//		}
		int rLow=0;
		int rUp=matrix.length-1;		
		int cLow=0;
		int cUp=matrix[0].length-1;
		
		while(rLow<=rUp && cLow<=cUp) {
			//cLow to cUp
			for(int i=cLow;i<=cUp;i++) {
				System.out.print(matrix[rLow][i]);
			}
			rLow++;
			
			//cUp to down
			for(int i=rLow;i<=rUp;i++) {
				System.out.print(matrix[i][cUp]);
			}
			cUp--;
			
			//down to rUp
			for(int i=cUp;i>=cLow;i--) {
				System.out.print(matrix[rUp][i]);
			}
			rUp--;
			
			//rUp to rLow
			for(int i=rUp;i>=rLow;i--) {
				System.out.print(matrix[i][cLow]);
			}
			cLow++;
		}
	}

}
