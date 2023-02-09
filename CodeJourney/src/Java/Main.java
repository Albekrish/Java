package Java;

/*class GrandParent{
    int a=100;
    static int b=2000;
	
	 * void display() { System.out.println("GrandParent"); }
	 
}
class Parent extends GrandParent{
    int a=10;
    static int b=20;
	
	 * Parent(){ b=30; }
	 
	
	
	  void display() { System.out.println("parent"); }
	 
	 }*/
class Child  {

	int a = 11;
	static int b = 22;
	private Child(){
		System.out.println("Hi");
	}

	/* void display(){ System.out.println("child"); } */

}

public class Main {
	public static void main(String[] args) {
		// Parent object=new Parent();
		Child object1 = new Child();
		// GrandParent obj=new Child();
		// Child obj1=new Child();
		// System.out.println(object.b);
		// System.out.println(object1.b);
		// System.out.println(obj.b);
		// System.out.println(obj1.b);
		// obj.display();
		object1.display();
	}
}
