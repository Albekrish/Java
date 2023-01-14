package set2;

import java.util.Arrays;

//Java program to find a character in a given string using binary search.
public class CharBinarySearch {

	public static void main(String[] args) {
		String s="hello";		
		char key='e';
		
		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		
		int low=0;
		int high=ch.length-1;
		
		while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = ch[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
            	System.out.println(mid); // key found
        }
        System.out.println(-(low + 1));   // key not found.

	}

}
