package set1;

/*Using Recursion reverse the string such as
Eg 1:  Input: one two three
       Output: three two one
Eg 2:  Input: I love india
       Output: india love I*/
       
public class StringSplit52 {

	public static void main(String[] args) {
		String s="one two three";
		//method 1 without recursion
		/*
		 * String result=""; String[] st=s.split(" ");
		 * 
		 * for(int i=st.length-1;i>=0;i--) { result += st[i]+" "; }
		 * 
		 * System.out.print(result.trim()); System.out.println();
		 */
		//using recursion
		
/*		String str= "one two three";
//		reverse(str);
	}


	public static void reverse(String s) {
		if(s==null|| s.length()<=1) {
			System.out.println(s);
		}else {
			System.out.print(s.charAt(s.length()-1));
			reverse(s.substring(0,s.length()-1));   //o/p: eerht owt eno
		}
	}*/
		String str= "one two three";
		int i = str.length() - 1;
		int start, end = i + 1;
		String result = "";
		
		while (i >= 0) {
		if (str.charAt(i) == ' ') {
			start = i + 1;
			while (start != end)
			result += str.charAt(start++);
			
			result += ' ';
			end = i;
		}
		i--;
	}
	start = 0;
		while (start != end)
		result += str.charAt(start++);
		
		System.out.print(result);
		
}
}