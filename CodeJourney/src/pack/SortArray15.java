/*5. Sorting a 2D Array according to values in any given column in Java
We are given a 2D array of order N X M and a column number K ( 1<=K<=m).
Our task is to sort the 2D array according to values in the Column K.
*/
package pack;

import java.util.Arrays;
import java.util.Comparator;

public class SortArray15 {

	public static void main(String[] args) {
		
		int arr[][]={{39,27,11,42}, 
		        	{10,93,91,90}, 
		        	{54,78,56,89},
		        	{24,64,20,65}};
		
		int col=3;
		
		arraySort(arr,col-1);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

	public static void arraySort(int[][]a,int cl)
	{
		Arrays.sort(a, new Comparator <int[]>() {
			
		  @Override
		  public int compare(int[] val1, int[]val2) {
			  //col start from 0, so reducing col-1 to compare
			  if(val1[cl] > val2[cl])
				  return 1;
			  else
				  return -1;
		  }
	 });	
	}
}
