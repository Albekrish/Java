package set1;

import java.util.Scanner;

/*Java Program to left rotate (90 degree) the elements of a multidimensional array.*/
public class ArrayRotateLeftMulti11 {

	public static void main(String[] args) {
		/*
		 * Scanner sc=new Scanner(System.in); int n=sc.nextInt(); int[][] a=new
		 * int[n][n];
		 * 
		 * for(int i=0;i<n;i++) { for(int j=0;j<n;j++) { a[i][j]=sc.nextInt(); } }
		 */
		
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};  //1 2 3
		int n=a.length; //row                    4 5 6
		//										 7 8 9
				
		//traverse a matrix which change row-column {{1,4,7},{2,5,8},{3,6,9}}
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {  //upper triangle is enough i to<n
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		
		//swap cloumn {{7,4,1},{8,5,2},{9,6,3}}
		//li=>left index ri=>rightindex
		for(int i=0;i<n;i++) {
			int li=0;
			int ri=a[i].length-1;
			
			while(li<ri) {
				int temp=a[i][li];
				a[i][li]=a[i][ri];
				a[i][ri]=temp;
				li++;
				ri--;
			}
			
			
		}
		
		//To display
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
