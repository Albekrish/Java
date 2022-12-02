package set1;

/*Program to Check Whether a Number is Even or Odd
*/public class NumOddOrEven28 {

	public static void main(String[] args) {
		int n=1;
		
		//method1 native
		if(n%2 ==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
		//method 2: ternary
		
		String res= (n%2 == 0)? "even":"odd";
		System.out.println(res);
			

	}

}
