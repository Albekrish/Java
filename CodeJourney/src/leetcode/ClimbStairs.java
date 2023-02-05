package leetcode;
//70. Climbing Stairs

public class ClimbStairs {

	public static void main(String[] args) {
		int n=3;
		 // return helper(n);
    }
    public static int helper(int n){
        if(n==1) return 1;
        if(n==2) return 2;

        return helper(n-1)+helper(n-2);
    }
}
