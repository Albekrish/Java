package javapractice;

public class RemoveChar {

	public static void main(String[] args) {
		String S= "AA1d23cBB4";
		char[] a=S.toCharArray();
	//METHOD 1: using charcter
        String ans="";
        
        for(char i: a){
            if(Character.isLetter(i)){
                ans += i;
            }
        }
        System.out.println(ans);
        
      //Method 2: using regex
        
     // replace the given string
        // with empty string
        // except the pattern "[^a-zA-Z0-9]"
    	
    	String out= S.replaceAll("[^a-zA-z]", "");
    	System.out.println(out);
	}

	
}
