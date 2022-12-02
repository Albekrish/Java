package set1;

/*46) Java Program to rotate the elements of an array in the right direction*/
public class ArrayRotateRight46 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};		
		int n=3; //no.of times rotate right
		
		for(int i=0;i<n;i++) { //no of time rotate
			int temp=a[a.length-1];
			
			for(int j=a.length-1;j>0;j--) {  //to rotate element
				a[j]=a[j-1];
			}
			a[0]=temp;
		}
		
		for(int e:a) {
			System.out.print(e);
		}
	}
}
