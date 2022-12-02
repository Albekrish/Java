package set1;

/*Evaluate the following expression on paper and on program and understand the
difference
x = x++ * 2 + 3 * –x;
*/

public class Equa20 {

	public static void main(String[] args) {
			int x=5;
			
			x=x++ * 2 + 3 *--x;
			
			System.out.println(x);

	}

}
