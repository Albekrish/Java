package set1;
/*Write a single program to generate a multiplicaiton and subtraction table for a given
number.*/

import java.util.Scanner;

public class MultAndSubTab1 {

	public static void main(String[] args) {
		System.out.print("Enter the number ");  
		Scanner sc = new Scanner(System.in);  
	    int num = sc.nextInt();
	    
	    System.out.println("Multiplication Table:"); 
	    for (int i = 1; i <= 10; i++) {
	    	System.out.println(num + " * " + i + " = "+ num * i);
	    }
	    
	   System.out.println("Subtraction Table:");
	   for (int j = 1; j <=10 ; j++) {
		   System.out.println(j+ " - " + num + " = " + (j-num));
		   } 

	}

}
