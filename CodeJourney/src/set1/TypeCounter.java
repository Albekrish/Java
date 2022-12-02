package set1;

public class TypeCounter {

	public static void main(String[] args) {
		String s="can you give me 10bucks puff in 7.5 or 7";
		
		int scount,count,dcount;
		
		String[] str=s.split(" ");
		char[] c=new char[str.length];
		
		for(String a: str) {
			
		 for(int i=0;i<a.length();i++) { //a0,a1..
			 
			 for(int j=0;j<a.length();j++) {				 
				 c[j]=a.charAt(j);
				
			 }
			 
			 
		 }
		
			
		}
		

	}

}
