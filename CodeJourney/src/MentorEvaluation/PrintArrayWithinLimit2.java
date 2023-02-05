package MentorEvaluation;

import java.util.Scanner;

public class PrintArrayWithinLimit2 {

	public static void main(String[] args) {
		/*
		 * Scanner sc= new Scanner (System.in);
		 * System.out.println("Pls enter the size of the array:"); int N= sc.nextInt();
		 * System.out.println("Pls enter the starting range:"); int X=sc.nextInt();
		 * System.out.println("Pls enter the ending range"); int Y=sc.nextInt();
		 * System.out.println("Pls enter the array elements:"); int[] arr= new int[N];
		 * for(int i=0;i<N;i++) { arr[i]=sc.nextInt(); }
		 */
		
		int N=6, X=10, Y=14;
		
		int[] arr= {4,3,7,11,50,1};
		
		for(int i=0;i<N;i++) {
			if(arr[i] >X && arr[i]<Y) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
