package MentorEvaluation;

public class SnakeMatrix1 {

	public static void main(String[] args) {
		int n=4;
		boolean flag=true;
		
		int k=1;
		for(int i=1;i<=n;i++) {
			int  temp=1;
			for(int j=i;j<n;j++) {     //space
				System.out.print("  ");
			}
			for(int j=1;flag==true && j<=n;j++) {  //odd row
				System.out.print(k +" ");	
				k++;
			}
			for(int j=1;flag==false && j<=n;j++) { //even row
				System.out.print(k+n-temp +" ");
				k++;
				temp +=2;
			}			
			System.out.println();
			flag = !flag;
			
		}

	}

}
