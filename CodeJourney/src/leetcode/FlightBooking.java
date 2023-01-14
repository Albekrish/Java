package leetcode;

import java.util.Arrays;

class FlightBooking{
	public static void main(String[] args) {
		int[][] bookings={{1,2,10},{2,3,20},{2,5,25}};
		int n=5;
		
		  int[] res = new int[n];
		  for (int[] v : bookings) {
		    res[v[0] - 1] += v[2];
		    if (v[1] < n) res[v[1]] -= v[2];
		  }
		  for (int i = 1; i < n; ++i) res[i] += res[i - 1];
		  System.out.println(Arrays.toString(res));
	}
}
