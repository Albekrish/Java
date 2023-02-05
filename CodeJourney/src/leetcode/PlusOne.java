package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
	 int[] digits= {1,2,3};
	 
	 int n=digits.length; 
	 for(int i=digits.length-1;i>=0;i--) {
		 if(digits[i]<9) {
			 digits[i]++;
			 System.out.println(Arrays.toString(digits));
		 }
		 digits[i]=0;
	 }
	 int[] result= new int[n+1];
	 digits[0]=1;
	 System.out.println(Arrays.toString(result));
	}

}
