package set2;

import java.util.Arrays;

public class StringReverse61 {

	public static void main(String[] args) {
		
		
		// Method 1: using String array
		String[] a={"hi","hello"};		
		
		for(int i=a.length-1; i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		//Method 2: using String Builder reverse a string
		String s="Geeks for Geeks";
		StringBuilder sb=new StringBuilder();
		
		sb.append(s).reverse();
		
		System.out.println(sb);
		
		System.out.println();
		//method 3 string builder to reverse a string array
		String[] str={"hi","hello"};
		
		StringBuilder st=new StringBuilder();
		
		for(int i=str.length-1;i>=0;i--) {
			st.append(str[i]).append(" ");			
		}
		
		String[] result= st.toString().split(" ");
		System.out.println(Arrays.toString(result));
		
	}

}
