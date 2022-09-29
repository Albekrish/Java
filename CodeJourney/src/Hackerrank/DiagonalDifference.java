package Hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*Sample Input
3
11 2 4
4 5 6
10 8 -12

Sample Output
15*/

public class DiagonalDifference {
public static void main(String[] args) {	
		
		//List<Integer> arr= new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		List<List<Integer>> arr = new ArrayList<List<Integer>>(); 
		for(int i = 0; i< n; i++){ 
			List<Integer> integers = new ArrayList<Integer>(); 
			for(int j=0; j<n; j++){ 				 
				integers.add(sc.nextInt()); 
			} 
			arr.add(integers); 
			System.out.println(diagonalDifference(arr));
		} 
	                        
}
	 public static int diagonalDifference(List<List<Integer>> arr) {
	        int a=0;
	        int b=0;
	        for(int i=0;i<arr.size();i++){
	            for(int j=0;j<arr.get(i).size();j++){
	                if(i == j){
	                     a += arr.get(i).get(j);
	                }
	                if(i+j == arr.size()-1){
	                     b += arr.get(i).get(j);
	                }
	            }           
	        }
	      return (a>b) ? (a-b) : (b-a); 
	    }
}
