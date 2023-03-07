package Interview;

import java.util.HashMap;
import java.util.Map;

public class StringConcadination {
	public static void main(String[] args) {
		Map<String, String> hm=new HashMap<>();
		String[] word= {"Abc", "John", "cat","Opera", "Noon"};		
		String result="";
		
		for(int i=0;i<word.length-1;i++){
			String st= word[0].toLowerCase();
			char ch=st.charAt(st.length()-1);
			
			for(int j=i+1;j<word.length;j++) {
				String st1=word[j].toLowerCase();
				char ch1= st1.charAt(0);				
				if(ch==ch1) {					
					hm.put(word[i], word[j]);
				}
			}
		}
		System.out.println(hm);
	}
	
}
