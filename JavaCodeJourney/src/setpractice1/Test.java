package setpractice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Test{

	public static void main(String[] args) {
	
		int[] arr1={1, 2, 3, 4, 5, 6}; 
		int[] arr2={7, 8, 9, 0};
		
		int a1=arr1.length;
		int a2=arr2.length;
		
		int res=a1+a2;
		
		int[] result=new int[res];
		
		System.arraycopy(arr1, 0, result, 0, a1);
		System.arraycopy(arr2, 0, result, a1, a2);
		
		System.out.println(Arrays.toString(result));
		
	}	
}
