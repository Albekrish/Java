package set1;

/*44) Java Program to print the duplicate elements of an array*/
public class ArrayDuplicateEle44 {

	public static void main(String[] args) {
		int[] a= {2,3,4,2};
		
		for(int i=0;i<a.length;i++) {  //we can also do till a.length
			for(int j=i+1;j<a.length;j++) {
				if(a[i] == a[j]) {
					System.out.print(a[i]+" ");
				}
			}
		}

	}

}
