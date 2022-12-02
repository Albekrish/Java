package javapractice;

public class Pattern2 {

	public static void main(String[] args) {
		pattern1(4);
		System.out.println();
		pattern2(4);
		System.out.println();
		pattern3(4);
	}
	
	public static void pattern1(int n) { 
		
		for(int row=1;row<=n;row++) {
			//space
			for(int s=1;s<=n-row;s++) {
				System.out.print("  ");
			}
			
			//no
			for(int col=row;col>=1;col--) {
				System.out.print(col+" ");
			}
			for(int col=2;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}
	
public static void pattern2(int n) { 
		
		for(int row=1;row<=2*n-1;row++) {
			int c= row>n ? 2*n-row:row;
			//space
			for(int s=1;s<=n-c;s++) {
				System.out.print("  ");
			}
			
			//no
			for(int col=c;col>=1;col--) {
				System.out.print(col+" ");
			}
			for(int col=2;col<=c;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void pattern3(int n) { 
		int ori_n=n;
		n=2*n-1;
		for(int row=0;row<=n;row++) {		
			for(int col=0;col<=n;col++) {
			int index=ori_n-Math.min(Math.min(row, col), Math.min(n-row,n-col)); //find min (left,right,up,down)
			System.out.print(index+" ");
			}
			System.out.println();
		}
	
	}

}
