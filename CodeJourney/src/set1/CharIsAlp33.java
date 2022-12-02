package set1;
//Program to Check Whether a Character is an Alphabet or not
public class CharIsAlp33 {

	public static void main(String[] args) {
		//char c='*';
		char c='a';
		
		//Method1: if else
		
		if((c>='a' && c<='z') || (c>='A' && c<='Z')) {
			System.out.println(c+"is an alphabet");
		}else {
			System.out.println(c+"is a not an alphabet");
		}
		
		//Method 2 ternary operator
		
		String out= (c>='a' && c<='z') || (c>='A' && c<='Z') ? 
					c+"is a alphabet":c+"is a not alphabet";
		System.out.println(out);
		
		//Using library fun
		
		if(Character.isAlphabetic(c)) {
			System.out.println(c+"is a alphabet");
		}else {
			System.out.println(c+"is a not alphabet");
		}

	}

}
