package leetcode;
//557. Reverse Words in a String III

public class ReverseWordString {

	public static void main(String[] args) {
		String st="Let's take LeetCode contest";
		String[] str= st.split(" ");
		String result="";
		for(String i:str) {
			result+=reverse(i)+" ";
		}
		System.out.println(result.trim());
	}
	public static String reverse(String s) {
			int start=0;
			int end=s.length()-1;
			String out="";
			while(start<=end) {
				out += s.charAt(end);
				end--;
			}
		return out;

	}
}
