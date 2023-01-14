package pack;

/*Input: arr[] = [3, 4, 2, 0, 1} 
Output: Yes 
Explanation: 
In the given array: 
index(0) -> value(3) 
index(1) -> value(4) 
index(2) -> value(2) 
index(3) -> value(0) 
index(4) -> value(1) 
To find the inverse of the array, swap the index and the value of the array. 
index(3) -> value(0) 
index(4) -> value(1) 
index(2) -> value(2) 
index(0) -> value(3) 
index(1) -> value(4)
Inverse arr[] = {3, 4, 2, 0, 1} 
So, the inverse array is equal to the given array.*/
public class MirrorInverseArray10 {

	public static void main(String[] args) {
		int[] a= {2,4,2,0,1};
		boolean flag=true;
		for(int i=0;i<a.length;i++) {
			if(a[a[i]] != i) {				
				flag=false; //return false
			}		
		}
		if(flag) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
		
	}

}
