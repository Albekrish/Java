package set1;

import java.util.Arrays;

/*41) Java Program to copy all elements of one array into another array*/

public class ArrayCopy41 {

	public static void main(String[] args) {
		
		int[] a= {3,4,2,1,5,6};
		int n=a.length;
		
		
		//Method1: using loop	
		int[] b=new int[a.length];
		
		
		  for(int i=0;i<n;i++) { b[i]=a[i]; }
		  
		  for(int j:b) { System.out.print(j+" "); }
		 
		System.out.println();
		//Method2: using clone   it is slow compare to System.arrayCopy
		
		int[] c=a.clone();
		for(int j:c) 
		{ 
			System.out.print(j+" ");		
		}
		System.out.println();
//Method 3: System.arrayCopy(source,source position,destination,destination position,length)
		
		int[] d= new int[n];
		System.arraycopy(a, 0, d, 0, n);
		
		for(int j:d) 
		{ 
			System.out.print(j+" ");		
		}
		System.out.println();
		
//Method 4: Arrays.copyOf(original array,length)		
		
		int[] e=Arrays.copyOf(a, n);
		
		for(int j:e) 
		{ 
			System.out.print(j+" ");		
		}
		
		System.out.println();
//Method 5: Arrays.copyOfRange(original, from,to)
		
		int[] f=Arrays.copyOfRange(a, 2, n);
		for(int j:f) 
		{ 
			System.out.print(j+" ");		
		}
	}

}
