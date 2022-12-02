package set1;

import java.util.Scanner;

/*60) Write a program to find the sum of the series. The series will be like 1 +11 + 111 +
1111 +.. n terms.
Eg 1: Input:  Input the number of terms : 5
Output :
1 + 11 + 111 + 1111 + 11111
The Sum is : 12345
Eg 2: Input:  Input the number of terms : 3
Output :
1 + 11 + 111
The Sum is : 123
*/
public class SeriousSum60 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0, j=1;
		for(int i=1;i<=n;i++) {
			sum += j;
			j= (j*10)+1;
		}				
		System.out.println("The sum is:"+sum);
		int temp=0, sum1=0;
		for(int i=1;i<=n;i++) {
			temp= (temp*10)+1;
			sum1 += temp;		
		}
		System.out.println(sum1);
	}

}
