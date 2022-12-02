package set1;

/*43) Java Program to left rotate the elements of an array*/
public class ArrayRotateLeft43 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};		
		int n=3; //no.of times rotate left
		
		for(int i=0;i<n;i++) {
			int temp=a[0];
			
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		
		for(int e:a) {
			System.out.print(e);
		}
	}

}
