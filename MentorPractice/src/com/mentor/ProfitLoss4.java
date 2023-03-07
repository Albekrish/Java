package com.mentor;

public class ProfitLoss4 {

	public static void main(String[] args) {
		int[] a= {7,1,5,3,6,4};
		//int[] a= {7,6,4,3,1};
		int n=a.length, max=0;		
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					max= Math.max(max, a[j]-a[i]);
				}
			}
		}
		System.out.println(max);
		
	}

}
