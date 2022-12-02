package pack;

/*Write a program to find the n number of pronic and prime number.
A pronic number is a number which is the product of two 
consecutive integers, that is, a number of the form n(n + 1). Ex: 3*4=12.
A factor is a whole number that can be divided evenly into another 
number.
Ex:2, 3, 5, 7*/
public class PronicPrime8 {

	public static void main(String[] args) {
		
		int n=10;
		//pronic number n(n+1) from 1-10 range
		for(int num=0;num<=n;num++) {
			for(int j=0;j<=num/2;j++) {  //number can be divide by half of its number nly
				if(j*(j+1) == num) {
					//System.out.println(num);
				}
			}
		}
		
		boolean flag;
		
		//Prime number 
		for(int num=2;num<=n;num++) {
			flag=true;			
		for(int i=2;i<=num/2;i++) {
			if(num % i == 0 ) {
				flag=false;
			}
		}
		if(flag) {
			System.out.println(num);			
		}
		}
	}
}
