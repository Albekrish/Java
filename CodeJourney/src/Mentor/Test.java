package Mentor;

import java.util.Scanner;

public class Test{
	public static void main(String[] args) {
		ArrayListNew obj=new ArrayListNew();
		
		Scanner sc=new Scanner(System.in);
		int[] a= {1,2,3,4,5};
		
		//To handle user i/p	
		while(true) {			
			System.out.println("Enter the operation to perform:");
			System.out.println("1.Insert");			
			System.out.println("2.Delete");
			int ip=sc.nextInt();
			
			if(ip == 1) {
				System.out.println("Enter the value to insert at the last index:");
				int value=sc.nextInt();				
				obj.insertElement(value, a);
			}else if(ip == 2) {
				System.out.println("Enter the index to delete:");
				int index=sc.nextInt();
				obj.deleteElement(index, a);				
			}
			System.out.println("Do you want to continue: Y/N");
			char c=sc.next().charAt(0);
			if(c =='N') {
				System.out.println("Thank you!");
				break;
			}			
		}		
	}	
	
}
