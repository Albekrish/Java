package set1;
/*Program to Find the Largest Number Among Three Numbers*/
public class LarNumAmoThree30 {

	public static void main(String[] args) {
		int a=23,b=11,c=67;
		//using ternary operator
		int temp=a>b? a:b;
		int largest=c>temp? c:temp;
		System.out.println(largest);
		
		//using if else
		if(a>=b && a>=c) {
			System.out.println(a);
		}else if(b>=a&& b>=c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
		

	}

}
