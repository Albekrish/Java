package leetcode;

import java.util.Arrays;

//https://www.youtube.com/watch?v=uC0aDIhwGdE
public class MinArrowBallonBurst {

	public static void main(String[] args) {
		int[][] points= {{10,16},{2,8},{1,6},{7,12}};		
		int n=points.length;
		
		Arrays.sort(points,(a,b)->Integer.compare(a[1], b[1])); // {1,6},{2,8},{7,12},{10,16}
		
		int arrow=1;
		int end=points[0][1];
		
		for(int i=0;i<n;i++) {
			if(points[i][0]>end) {
				arrow++;
				end=points[i][1];
			}
		}
		
		System.out.println(arrow);
	}

}
