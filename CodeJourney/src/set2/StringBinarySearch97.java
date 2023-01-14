package set2;

import java.util.Arrays;

//Java program to find a character in a given string using binary search
public class StringBinarySearch97 {

	public static void main(String[] args) {
		String s= "Hello";
		int start=0;
		int end=s.length()-1;
		
		char[] ch=s.toCharArray();
		char key='o';
		
		//Method1:
		//System.out.println(Arrays.binarySearch(ch, 0, s.length(), key));
		
		//Method2:		
		int result= binarySearch(ch,key, start, end);
		System.out.println(result);
	}
	public static int binarySearch(char[] ch,char key,int left, int right){
		
		while(left<=right) {
			int mid=(left+right)/2;
			if(ch[mid] == key ) {
				return mid;
			}else if(ch[mid]<key) {
				left=mid+1;
			}else if(ch[mid]>key) {
				right=mid-1;
			}				
		}
		return -(left+1);	
		
	}

}

/*if (last>=first){  
            int mid = first + (last - first)/2;  
            if (arr[mid] == key){  
            return mid;  
            }  
            if (arr[mid] > key){  
            return binarySearch(arr, first, mid-1, key);//search in left subarray  
            }else{  
            return binarySearch(arr, mid+1, last, key);//search in right subarray  
            }  
        }  
        return -1;  
    } */