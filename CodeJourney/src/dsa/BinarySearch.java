package dsa;
//applicable for sorted arrays 
public class BinarySearch {

	public static void main(String[] args) {
		int n=30;
		int[] arr= {5,14,18,21,26,28,30,58,70,85};
		int res=binarySearch(arr,n);
		System.out.println(res);

	}
	public static int binarySearch(int[] a, int num) {
		int low=0;
		int high=a.length;
		
		while(low<=high) {
			int mid=(low+high)/2;
			
			if(num == a[mid]) return mid;
			else if(num>a[mid]) low=mid+1;
			else if(num<a[mid]) high=mid-1;
		}
		return -1; //no mach found
	}
}
