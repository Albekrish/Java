package set1;

/*Program to Find Factorial of a Number and the factorial number's sum of digits.
 * Input: N = 5
Output: 153
Explanation: 1! + 2! + 3! + 4! + 5! = 1 + 2 + 6 + 24 + 120 = 153.
*/
public class FactNumAndSum35 {

	public static void main(String[] args) {
		int n=5;
		int sum=0, fact=1;
		
		for(int i=1;i<=n;i++) {
			fact= fact*i;
			sum += fact;
		}
		System.out.println("Fact-"+fact);
		System.out.println("sum-"+sum);
	}

}
