package set1;

/*Using Recursion reverse the string such as
Eg 1:  Input: one two three
       Output: three two one
Eg 2:  Input: I love india
       Output: india love I*/
       
public class StringSplit52 {

	public static void main(String[] args) {
		String str="one two three";		
		
		String out= reverse(str);		
		System.out.println(out); //eerht owt eno
		
		String[] s=out.split(" ");
		String res="";
		for(String i:s) {
			res += reverse(i)+" ";
		}
		System.out.println(res);
	}
	
	
	public static String reverse(String s) {		
		int n=s.length();
		if(s==null || n<=1) {
			return s;
		}else {		
			return s.charAt(n-1)+reverse(s.substring(0,n-1));			
		}
		
		
		
		//method 1 without recursion
		/*
		 * String result=""; String[] st=s.split(" ");
		 * 
		 * for(int i=st.length-1;i>=0;i--) { result += st[i]+" "; }
		 * 
		 * System.out.print(result.trim()); System.out.println();
		 */
		//using recursion
		
/*
 * String str= "one two three"; // reverse(str); }
 * 
 * 
 * public static void reverse(String s) { if(s==null|| s.length()<=1) {
 * System.out.println(s); }else { System.out.print(s.charAt(s.length()-1));
 * reverse(s.substring(0,s.length()-1)); //o/p: eerht owt eno } }
 *//*
	 * String str= "one two three"; int n = str.length() - 1; int start, end = n +
	 * 1; String result = "";
	 * 
	 * while (n >= 0) { if (str.charAt(n) == ' ') { start = n + 1; while (start !=
	 * end) result += str.charAt(start++);
	 * 
	 * result += ' '; end = n; } n--; } start = 0; while (start != end) result +=
	 * str.charAt(start++);
	 * 
	 * System.out.print(result);
	 */
		
}
}