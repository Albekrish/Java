package leetcode;

public class MinTimeComplteTrip {

	public static void main(String[] args) {
//		int[] time= {5,10,10};
//		int totalTrips=9;
		int[] time= {2};
		int totalTrips=1;		
		int t=1, count=0;
		
		outer: while(true) {
			inner: for(int i:time){
				if(i<=t) {
					count++;
				}
				if(count==totalTrips) {
					System.out.println(t);
					break outer;
				}
			}
			t++;
		}

	}

}
