package javapractice;

public class Pattern1 {

	public static void main(String[] args) {
		pattern1(4);
		System.out.println();
		pattern2(4);
		System.out.println();
		pattern3(4);
		System.out.println();
		pattern4(4);
		System.out.println();
		pattern5(5);
		System.out.println();
		pattern6(5);
		System.out.println();
		pattern7(5);
		System.out.println();
		pattern8(5);
		System.out.println();
		pattern9(5);

	}
	public static void pattern1(int n) {    	
    	
    	for(int row=1;row<=n;row++) {
    		for(int col=1;col<=n;col++) {
    			System.out.print("* ");
    		}
    		System.out.println();
    	}
    }
	
    public static void pattern2(int n) {    	
    	
    	for(int row=1;row<=n;row++) {
    		for(int col=1;col<=row;col++) {
    			System.out.print("* ");
    		}
    		System.out.println();
    	}
    }
    
 public static void pattern3(int n) {    	
    	
    	for(int row=1;row<=n;row++) {
    		for(int col=1;col<=n-row+1;col++) {
    			System.out.print("* ");
    		}
    		
    	//	OR  for(int col=n;col>=row;col--) {
    	//		System.out.print("* ");
    	//	}
    		System.out.println();
    	}
    }
 
 public static void pattern4(int n) {    	
 	
 	for(int row=1;row<=n;row++) {
 		for(int col=1;col<=row;col++) {
 			System.out.print(col+" ");
 		}
 		System.out.println();
 	}
 }
 
 public static void pattern5(int n) {    	
	 	
	 	for(int row=1;row<=(2*n)-1;row++) {
	 		int totalCol= row>n ? (2*n-row):row;
	 		for(int col=1;col<=totalCol;col++) {
	 			System.out.print("* ");
	 		}
	 		System.out.println();
	 	}
	 }
 
 public static void pattern6(int n) {    	
	 	
	 	for(int row=1;row<=n;row++) {
	 		//space
	 		for(int j=1;j<=n-row;j++) {
	 			System.out.print("  ");
	 		}
	 		//star
	 		for(int col=1;col<=row;col++) {
	 			System.out.print("* ");
	 		}
	 		System.out.println();
	 	}
	 }
 
 public static void pattern7(int n) {    	
	 	
	 	for(int row=1;row<=n;row++) {
	 		//space
	 		for(int j=1;j<=n-row;j++) {
	 			System.out.print("  ");
	 		}
	 		//star
	 		for(int col=1;col<=(2*row)-1;col++) {
	 			System.out.print("* ");
	 		}
	 			 		
	 		System.out.println();
	 	}
	 }
 
 public static void pattern8(int n) {    	
	 	
	 	for(int row=1;row<=n;row++) {
	 		//space
	 		for(int j=1;j<=row-1;j++) {
	 			System.out.print("  ");
	 		}
	 		//star
	 		for(int col=1;col<=2*(n-row)+1;col++) {
	 			System.out.print("* ");
	 		}
	 			 		
	 		System.out.println();
	 	}
	 }
 
 public static void pattern9(int n) {    	
	 	for(int row=1;row<=2*n-1;row++) {
	 		int totalCol= row>n ? 2*n-row:row;
	 		
	 		int noOfSpaces=n-totalCol;
	 		
	 		for(int s=1;s<=noOfSpaces;s++) {
	 			System.out.print(" ");
	 		}
	 		for(int col=1;col<=totalCol;col++) {
	 			System.out.print("* ");
	 		}
	 		System.out.println();
	 	}
	
	 }
  
}


