package set2;
//Java Program to sort the words in ascending
import java.util.Arrays;

public class StringSortAsce90 {
	public static void main(String[] args) {
		String[] s={"Joe","Sam","Ani"};
		int n=s.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(s[i].compareTo(s[j])>0){
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(s));
	}
}
