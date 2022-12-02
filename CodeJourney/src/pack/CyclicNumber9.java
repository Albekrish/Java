package pack;

/*A cyclic number is an integer in which cyclic permutations of the digits are successive 
multiples of the number. 
A number with n digits, which, when multiplied by 1, 2, 3, ..., n produces the same 
digits in a different order is known as a Cyclic Number. 
The most widely known is the six-digit number 142857 
Input : 142857
Output : Yes
Explanation
    142857 × 1 = 142857
    142857 × 2 = 285714
    142857 × 3 = 428571
    142857 × 4 = 571428
    142857 × 5 = 714285
    142857 × 6 = 857142 */

public class CyclicNumber9 {

	public static void main(String[] args) {
		long num=142857;
		long n=num;
		int count=0;
		boolean res=false;
		//calculate count
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println(count);
		long N=num;  //keep orig num value
		
		//check for num match
		while(true){			
			long rem= num%10;
			long div= num/10;			
			num=(long) (Math.pow(10, count-1)*rem + div);  //formula cyclic permutation			 
			if(num == N) {
				res=true;
				break;
			}
			
		}
		System.out.println(res);
	}

}
