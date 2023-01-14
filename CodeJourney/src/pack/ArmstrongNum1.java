package pack;

/*Write a program to check if a number is Armstrong's number or not? 
A) Input - 153 
            Output - It is an Armstrong Number
B) Input - 123
            Output - It is not an Armstrong Number*/

//An Armstrong number is a positive m-digit 
//number that is equal to the sum of the mth powers of their digits. 
//eg.153=> 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153
public class ArmstrongNum1 {

	public static void main(String[] args) {
		int n=153;
		int ori_n=n;
		int sum=0,rem=0;
		while(n>0) {
			rem=n%10;
			sum += (rem*rem*rem);  //Math.pow(rem,3);
			n=n/10;
		}
		System.out.println(sum);
		if(sum == ori_n) {
			System.out.println(ori_n+" is a Armstrong number");
		}else {
			System.out.println("Not a Armstrong no.");
		}

	}

}
