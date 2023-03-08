package com.mentor.practice1;

public class StrobogrammaticNumber3 {

	public static void main(String[] args) {
		int n=1691;
		String s=String.valueOf(n); //Integer.toString();
		char[] ch=s.toCharArray();
		
		int left=0, right=ch.length-1;
		
		if(s.matches("[01968]+")){
			boolean flag=true;
			while(left<=right) {
				char c=ch[left];
				if((c=='0' || c=='1' || c=='8') && (ch[left]==ch[right])) {
					left++;
					right--;
				}else if(c=='6' && ch[right]=='9' || c=='9' && ch[right]=='6') {
					left++;
					right--;
				}else {					
					flag=false;
					break;
				}				
			}
			if(flag) {
				System.out.println("StrobogrammaticNumber");
			}else{
				System.out.println("Not StrobogrammaticNumber");
			}
		}else {
			System.out.println("Not StrobogrammaticNumber");
		}

	}

}
