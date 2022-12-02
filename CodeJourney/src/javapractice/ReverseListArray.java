package javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// using Collections.reverse();  just to reverse

/*Reversing an ArrayList
Reversing a LinkedList
Reversing an array*/

public class ReverseListArray {

	public static void main(String[] args) {
		//arraylist & linked list are same except the way of sorting the fetching order
		//Method1: using list 
		 List<String> mylist = new ArrayList<String>(); 		  
	        mylist.add("practice"); 
	        mylist.add("code"); 
	        mylist.add("quiz"); 
	        mylist.add("geeksforgeeks"); 
	        
	        Collections.reverse(mylist);
	        System.out.println(mylist);
	        
	        //Method 2: using Array
	        
	        Integer [] arr = {10, 20, 30, 40, 50}; 
	        
	        Collections.reverse(Arrays.asList(arr));
	       // System.out.println(Arrays.asList(arr));
	        System.out.println(Arrays.toString(arr));
	        
	        for(Integer i:arr) {
	        	System.out.println(i);
	        }
	       
	}

}
