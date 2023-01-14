package pack;

/*Write a program to print the following structure ?
input - 5
output -
*
***
*****
***
*   */
public class Pattern3 {

	public static void main(String[] args) {
		int n=5;
		//row=5 col=5
		for(int i=1;i<=n/2+1;i++) {		
			for(int j=1;j<=(2*i)-1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n/2;i>=1;i--) {
			for(int j=1;j<=(2*i)-1;j++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
