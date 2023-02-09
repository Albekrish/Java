package javapractice;

import java.util.Arrays;

public class Fibonaciprime {
	 public static void main(String[] args) {

		    int i = 1, n = 10, firstTerm = 0, secondTerm = 1;
		    int[] result=new int[n];
		    System.out.println("Fibonacci Series till " + n + " terms:");
		    int j=0;
		    while (i <= n) {
		      if(checkPrime(firstTerm)) {
		    	  result[j++]=firstTerm;
		      }

		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;

		      i++;
		    }
		   System.out.println(Arrays.toString(result));
		  }
	static boolean checkPrime(int num) {
		
		if(num<2) return false;
		for(int i=2;i<num;i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
		
	}
}
