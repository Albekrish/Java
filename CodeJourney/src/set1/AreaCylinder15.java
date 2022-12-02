package set1;
/*Write a program to find the area of the cylinder
 * area= 2*pi*r(r+h)
 * */

public class AreaCylinder15 {

	public static void main(String[] args) {
		double r=4, h=5;
		
		double area= 2*Math.PI*r*(r+h);
		
		System.out.format("area=%.3f", area);

	}

}
