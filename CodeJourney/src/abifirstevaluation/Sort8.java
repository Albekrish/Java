package abifirstevaluation;

import java.util.Arrays;

public class Sort8 {

	public static void main(String[] args) {
		int a[]= {9,4,1,5,3,2,7};
		
		for(int i=1;i<a.length;i++){
			int key=a[i];
			int j=i-1;			
			while(j>=0&&a[j]>key)
			{
				a[j+1] = a[j];
                j = j-1;
			}
			a[j+1] = key;
		}
		System.out.println(Arrays.toString(a));
	}
}
