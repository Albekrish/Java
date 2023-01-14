package Mentor;

import java.util.Arrays;

public class ArrayListNew{
	
	//increase the size of an array & insert element at the last
	public void insertElement(int user_value, int[] arr) {
		int new_len=arr.length+5;
		int[] result =new int[new_len];	//array with 0's		
		
		int[] temp = arr.clone();	
		System.arraycopy(temp, 0, result, 0, temp.length);
		result[temp.length]=user_value;
		
		
		arr= new int[temp.length+1];		//Arraytrim	 
		System.arraycopy(result, 0, arr, 0, temp.length+1);
		System.out.println(Arrays.toString(arr));
	}	

	//delete one element with in the given array
	public void deleteElement(int user_index, int[] arr) {
		int[] temp= arr.clone();
		if(user_index>=temp.length) {
			System.out.println("ArrayIndexOutOfBoundException");
		}else {
			arr = new int[temp.length-1];
       
			for(int i=0,k=0;i<temp.length;i++){
				if(i!= user_index){
					arr[k]=temp[i];
					k++;
				}
			}
			System.out.println(Arrays.toString(arr));
		}		
		
	}	
}