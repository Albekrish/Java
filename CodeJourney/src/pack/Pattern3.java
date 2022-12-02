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
		
		for(int i=0;i<=n/2;i++) {
			for(int j=0;j<=(2*i);j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		int temp=n-1; //4  
		for(int i=n/2;i>0;i--) {
			for(int j=0;j<=temp-2;j++) { //4-2=2  
				System.out.print("* ");
			}
			temp=temp-2;  //4-2=2
			System.out.println();
		}
	}

}
