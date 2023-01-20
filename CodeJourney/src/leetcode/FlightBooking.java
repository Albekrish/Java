package leetcode;

import java.util.Arrays;

class FlightBooking{
	public static void main(String[] args) {
		int[][] bookings={{1,2,10},{2,3,20},{2,5,25}};
		int n=5;
		int[] count=new int[n];
        for(int[] entry:bookings){
            for(int i=entry[0]-1; i<entry[1];i++){
                count[i] += entry[2];
            }
        }
        System.out.println(count);
	}
}
