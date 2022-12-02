package set1;

/*Program to Check Whether a Number is Positive or Negative*/
public class NumPosOrNeg32 {

	public static void main(String[] args) {
		int n=-1;
		
		//Method1 if else
		if(n>0) {
			System.out.println(n+" is a positive number");
		}else if(n<0) {
			System.out.println(n+" is a negative number");
		}else {
			System.out.println(n+" is a zero");
		}
		
		//Method Math.signum needs double or float value
		double a =9.80;
		double result= Math.signum(a);
		System.out.println(result);  //1->pos -1->neg 0->0
		
		//Method Integer.signum
		int res=Integer.signum(n);  //-1->neg 1->pos 0->zero
		System.out.println(res);
	}

}
