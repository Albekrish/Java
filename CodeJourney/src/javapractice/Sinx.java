package javapractice;
//sin(x) = x - x3/3! + x5/5! - x7/7!..
public class Sinx {

	public static void main(String[] args) {
		int deg=30,	count=10;	
		double x= deg*(Math.PI/180);
		
		double sum=0;int sign=1,n=1;
		for(int i=1;n<=count;i+=2) {			//n-> to run 10 time
			sum += sign*Math.pow(x, i)/ fact(i);  //i = i+2 increment
		    sign *= -1;
		    n++;
		}
		System.out.format("%.2f",sum);
	}
	public static double fact(int n) {
		double fac=1;
		 for(int i=1;i<=n;i++) {
			 fac *= i;
		 }
		 return fac;
	}

}
