package set1;

/*Write a program to print a letters from the user input character to 'Z' without using
strings.
Example 1:  input : X
Output : XYZ
Example 2:  Input : M
Output : MNOPQRSTUWXYZ*/
public class CharPrintWoStr2 {

	public static void main(String[] args) {
		char c='M';
		
		for(char i=c;i<='Z';i++) {
			System.out.print(i);
		}
	}

}
