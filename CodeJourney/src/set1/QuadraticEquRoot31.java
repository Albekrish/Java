package set1;

/*Program to Find the Roots of a Quadratic Equation*/  
// x=-b+-Math.sqrt(b^2-4ac)/2a ..here determinant = b^2-4ac
public class QuadraticEquRoot31 {

	public static void main(String[] args) {
		double a=7.2,b=5,c=9;

		double det= (b*b-4*a*c);		
		if(det>0) {
			//roots are real and differnt root1&root2
			double root1= (-b+Math.sqrt(det))/(2*a);
			double root2=(-b-Math.sqrt(det))/(2*a);
			System.out.format("root1=%.2f and root2=%.2f", root1,root2);			
		}else if(det == 0) { //root are real and same
			
			double root3=(-b)/(2*a);
			System.out.format("root1=root2=%.2f ",root3);
		}else {  //root are complex and differnt and imaginary
			double real=(-b)/(2*a);
			double imag=Math.sqrt(-det)/(2*a);
			System.out.printf("root1=%.2f+%.2fi ", real,imag);
			System.out.printf("root2=%.2f-%.2fi ",real,imag);
			
		}
		
			
	}

}
