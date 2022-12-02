package set1;

/*Given the radius of two concentric circle, find the area of the space between the
circles
Area of circle Pi*r^2 . so sub outer circle are with inner circle area. here pi=3.1415
*/
public class AreaCircleTwoBw17 {

	public static void main(String[] args) {
		int x=2,y=1;
		
		double pi=3.1415;
		
		double outer=pi*x*x;
		
		double inner=pi*y*y;
		
		double result= outer-inner;
		System.out.println(result);

	}

}
