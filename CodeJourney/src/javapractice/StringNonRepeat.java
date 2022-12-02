package javapractice;

public class StringNonRepeat { //first non-repeating char

	public static void main(String[] args) {
		String s="hello";
	        for( char a: s.toCharArray()){
	          if(s.indexOf(a) == s.lastIndexOf(a)){
	             System.out.println(a);
	             break;
	         }     
	      
	    }

	}

}
