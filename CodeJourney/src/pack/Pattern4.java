package pack;

/*Write a program to print equilateral triangle (an equilateral triangle is a 
triangle in which all three sides are equal.)
input : 5
output :  
           *
         *   *
       *   *   *
     *   *   *   *
   *   *   *   *   */ 
public class Pattern4 {

	public static void main(String[] args) {
		
		int n=5; //row=5 col=5
		
		for(int i=1;i<=n;i++) {	
			for(int k=i;k<n;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
