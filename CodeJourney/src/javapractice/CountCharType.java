package javapractice;

import java.util.Arrays;

public class CountCharType {

	public static void main(String[] args) {

		String s= "#GeeKs01fOr@gEEks07";
		 
        int[] res=new int[4];
        
        for(char ch:s.toCharArray()) {
        	if(Character.isLowerCase(ch)) {
        		res[1]++;
        	}else if(Character.isUpperCase(ch)) {
        		res[0]++;
        	}else if(Character.isDigit(ch)) {
        		res[2]++;
        	}else {
        		res[3]++;
        	}
        	
        }
        System.out.println(Arrays.toString(res));
	}

}
