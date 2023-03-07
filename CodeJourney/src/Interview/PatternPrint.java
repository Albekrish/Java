package Interview;

public class PatternPrint {
	public static void main(String[] args) {
		int n=5, k=0, temp=0;
		
		for(int i=1;i<=n;i++) {
			temp=0;
			for(int j=1;j<=i;j++) {									
				if(j==1) {
					System.out.print(i+" ");
				}else{
					//System.out.print(i+j+temp+" ");
					System.out.print(i+j+temp+" ");
				}
				temp=temp+2;
				//temp=2*j;			
			}
			
			System.out.println();
		}
	}
}
