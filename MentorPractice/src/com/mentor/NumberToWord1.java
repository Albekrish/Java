package com.mentor;

public class NumberToWord1 {

	public static void main(String[] args) {
		int n=999;
		String result="";
		if(n>10 && n<20) {
			result += wordNum(4, n%10);
			System.out.println(result);
		}else {
			if(n/100 != 0) { //2
				result += wordNum(1, n/100);
				n %=100; //34
			}
			if(n>10 && n<20) {
				result += " and";
				result += wordNum(4, n%10);
			}else { 
				if(n/10 !=0){ //3
					result += " and";
					result += wordNum(2, n/10);
					n %=10; //4
				}
				if(n%10 !=0) {
					result += wordNum(3, n%10);
				}
			}
			
			System.out.println(result);
		}
	}
	public static String wordNum(int digit, int reminder) {
		String result="";
		String[] hunds= {"One Hundred ", "Two Hundred ", "Three Hundred ", "Four Hundred ", "Five Hundred ", "Six Hundred ",
				"Seven Hundred ", "Eight Hundred ", "Nine Hundred "};
		
		String[] tens= {"Ten ", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty "," Ninety "};
		String[] ones= {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String[] teens= {"Eleven ","Twelve ","Thirteen ", "Forteen ","Fifteen ","Sixteen ","Seventeen ","Eighteen ","Nineteen "};
		if(digit==1) {
			return hunds[reminder-1];
		}
		if(digit==2) {
			return tens[reminder-1];
		}
		if(digit==3) {
			return ones[reminder-1];
		}
		if(digit==4) {
			return teens[reminder-1];
		}
		return "";
	}
}
