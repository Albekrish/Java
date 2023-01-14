package set1;
/*Program to Find ASCII Value of a Character*/
public class CharAsciiVal24 {

	public static void main(String[] args) {
		char c='a';
		
		//Method 1 using variable int
		
		int asciivalue= c;
		
		System.out.println(asciivalue);
		
		//Method2: using typecasting
		int ch='a';
		System.out.println(ch);
		
		char n=5;
		
		System.out.println(1+n); //int value
		System.out.println('0'+n); //ascii 0=48+5
	}
	//0-9  -> 48 to 57
	//a-z  -> 97 to 122
	//A-Z  ->65 to 90

}
