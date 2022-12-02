package set1;

/*37) Java Program to print the elements of an array present on odd position*/
public class ArrayEvenEle36 {

	public static void main(String[] args) {
		int[] a= {9,7,6,4,3,2,-1};		
		int n=a.length;
		
		for(int i=0;i<n;i++) {
			if(i%2 !=0) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println(); 
		//or
		
		for(int i=1;i<n;i=i+2) {
			System.out.print(a[i]+" ");
		}
	}

}
