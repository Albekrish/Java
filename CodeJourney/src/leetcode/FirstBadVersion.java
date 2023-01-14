package leetcode;
//278. First Bad Version

public class FirstBadVersion {

	public static void main(String[] args) {
		System.out.println("Hello");
		//System.out.println(Integer.valueOf("heelo"));
	}

	/*
	 * The isBadVersion API is defined in the parent class VersionControl. boolean
	 * isBadVersion(int version);
	 * 
	 * public class Solution extends VersionControl {
	 *  public int firstBadVersion(int
	 * n) { int low=1,high=n,mid; while(low<=high){ mid=low+(high-low)/2;
	 * if(isBadVersion(mid) && isBadVersion(mid-1)== false) return mid; else
	 * if(isBadVersion(mid) && isBadVersion(mid-1) == true) high=mid-1; else
	 * low=mid+1; } return low; } }
	 * 
	 */
}
