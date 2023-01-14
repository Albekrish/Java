package set2;

import java.util.Arrays;

//Java Program to sort the characters in a word in descending
public class CharSortWordDes91 {

	public static void main(String[] args) {
		String s="geeksforgeeks";
		char[] ch=s.toCharArray();
		int n=ch.length;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(ch[i]<ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(ch));
	}

}
