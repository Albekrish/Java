package pack;

/*Write a program to print the below pattern
input :  5
output
    1        1
    12      21
    123    321
    1234  4321
    1234554321*/

public class Pattern5 {

	public static void main(String[] args) {
		int n=5;
		//no.ofrow=5 & no.of column=10 (2*row)
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=i;k<n;k++) {
				System.out.print(" ");
			}
			for(int k=i;k<n;k++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
