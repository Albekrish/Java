package dsa;
//Normal for loop to check all the index linearly
public class LinearSearch {

	public static void main(String[] args) {
		int n=90;
		int[] arr= {10,40,90,30};
		int res=linearSearch(arr,n);
		System.out.println(res);
	}
	public static int linearSearch(int[] arr, int num) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == num) {
				return i;
			}
		}
		return -1;
	}
}
