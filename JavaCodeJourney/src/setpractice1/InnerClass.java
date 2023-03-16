package setpractice1;
class Outer{
	static class Inner{
		int num=10;
	}
}
public class InnerClass {
	public static void main(String[] args) {
		
		Outer.Inner obj2=new Outer.Inner();
		System.out.println(obj2.num);
	}
}
