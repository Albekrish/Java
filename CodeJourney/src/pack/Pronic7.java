package pack;

/*Write a program to check whether a number is a Pronic 
Number(Heteromecic Number) or not.
A pronic number is a number which is the product of two consecutive 
integers, that is, a number of the form n(n + 1).
Sample pronic numbers are: 0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110
input : 6
output : It is a pronic number*/
public class Pronic7 {

	public static void main(String[] args) {
		int n=6;
		boolean flag=false;
		//pronic number i(i+1)=n
		for(int i=0;i<=n/2;i++) {
			if(i*(i+1) == n) {
				flag=true;
			}
		}
		if(flag) {
			System.out.println(n+" is a pronic number");
		}else {
			System.out.println("Not a pronic");
		}

	}

}
