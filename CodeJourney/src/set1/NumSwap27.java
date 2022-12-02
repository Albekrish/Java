package set1;

/*Program to Swap Two Numbers*/
public class NumSwap27 {

	public static void main(String[] args) {
		int a=10,b=20;
		//method1:using temp variable
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a+",b="+b);
		
		//Method2 without temp
		int m=2,n=3;
		m=m-n;
		n=m+n;
		m=n-m;
		System.out.println("m="+m+" n="+n);

	}

}
