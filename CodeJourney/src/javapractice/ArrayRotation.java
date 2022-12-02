package javapractice;

/*Input: 
arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
Output: 3 4 5 6 7 1 2
*/
public class ArrayRotation {

	public static void main(String[] args) {
		
		int[] arr={1, 2, 3, 4, 5, 6, 7};
		int d=2;
		
		// Method 1: using temp array		
		//rotateLeftArray(arr,d);
		
		// Method 2: Rotate one by one
		//rotateArray(arr,d);
		
		//Method 3: using reverse algoritham
		rotateArr(arr,d);
	}
	public static void rotateLeftArray(int a[], int d) {
		// Method 1: using temp array
		int[] temp= new int[a.length];
		int k=0;
		
		for(int i=d;i<a.length;i++) {
			temp[k]=a[i];
			k++;
		}
		
		for(int i=0;i<d;i++) {
			temp[k]=a[i];
			k++;
		}
		
		for(int i=0;i<a.length;i++) {
			a[i]=temp[i];
			System.out.print(a[i]+" ");
		}
	}
	
	public static void rotateArray(int a[], int d) {
		int n=a.length;
		
		int p=1;
		while(p<=d) {
			int temp=a[0];
			for(int i=0;i<n-1;i++) {
				a[i]=a[i+1];
			}
			a[n-1]=temp;
			p++;
		}
		for(int i=0;i<a.length;i++) {			
			System.out.print(a[i]+" ");
		}
	}
	
	public static void rotateArr(int a[], int d) {
		//1.reverse 0 to d-1  ==> 2 1
		//2.reverse d to n-1  ==> 7 6 5 4 3
		//3.reverse entire array 0 to n-1
		int n=a.length;
		reverseArray(a, 0,d-1);
		reverseArray(a, d,n-1);
		reverseArray(a, 0,n-1);
		
		for(int i=0;i<a.length;i++) {			
			System.out.print(a[i]+" ");
		}
	}
	
	public static void reverseArray(int a[],int start,int end) {
		int temp;
		while(start<end) {
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
	}
}
