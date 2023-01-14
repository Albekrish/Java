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
/*
 * //BigInteger fact  static BigInteger factorial(int N)     {         //
 * Initialize result         BigInteger f             = new BigInteger("1"); //
 * Or BigInteger.ONE           // Multiply f with 2, 3, ...N         for (int i
 * = 2; i <= N; i++)             f = f.multiply(BigInteger.valueOf(i));  
 *         return f;     }
 */


/*
 * class Solution { static ArrayList<Integer> factorial(int N){
 * ArrayList<Integer> res=new ArrayList<>();
 * 
 * java.math.BigInteger b=new java.math.BigInteger("1"); for(int i=2;i<=N;i++){
 * b=b.multiply(java.math.BigInteger.valueOf(i)); } String s=String.valueOf(b);
 * for(int i=0;i<s.length();i++){
 * res.add(Character.getNumericValue(s.charAt(i))); } return res; } }
 */