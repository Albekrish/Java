package mentorevaluation;

public class EncrptionString4 {

	public static void main(String[] args) {
		//String s1="bvjk";
		//String s2="afdr";
		
		String s1="mom";
		String s2="dad";
		char c;
		String result="";
		
		for(int i=0;i<s1.length();i++) {
			int position=s2.charAt(i)-96;			
			int en_str=s1.charAt(i)+position;
			
			if(en_str>122) {
				en_str -= 122;
				c= (char)(en_str+96) ;
			}else {
				c= (char)(en_str) ;
			}
			result += c;
		}
		System.out.println(result);
	}

}
