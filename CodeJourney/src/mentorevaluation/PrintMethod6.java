package mentorevaluation;

public class PrintMethod6 {
	
	public void print(String... strValues) {
		System.out.println("Inside Print:");
		for(String s: strValues) {
			System.out.print(s+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		PrintMethod6 obj=new PrintMethod6();
		obj.print();
		obj.print("hello");
		obj.print("we","are","from","ZSgs");
	}

}
