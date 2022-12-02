package set1;

/*  Evaluate the following expression on paper and on program and understand the
difference
i) ++a-b–                   ii) a%b++     iii)  a*=b+5               iv) x=69>>>2
*/

public class Equa18 {

	public static void main(String[] args) {
			int a=2,b=3;
			//method 1: 
			int x=++a - b--;
			
			System.out.println(x);
			
			//Method2
			a=3;
			b=2;
			int y= a%b++;
			System.out.println(y);
			
			//Method3
			a=2;
			b=3;
		    a*=b+5;
			System.out.println(a);
			
			//Method4 
			int j=69>>>2;
			System.out.println(j);

	}

}
