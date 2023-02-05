package leetcode;
//392. Is Subsequence

public class IsSubsequence{

	public static void main(String[] args) {
		String s="acb"; String t="ahbgdc";
		
		//Method 1: using two pointer
		int s_pointer=0;
		int t_pointer=0;
		
		while(t_pointer<t.length()) {
			if(t.charAt(t_pointer) == s.charAt(s_pointer)) {
				s_pointer++;
				
				if(s_pointer == s.length()) System.out.println(true);
			}
			
			t_pointer++;
		}
		
		//System.out.println(false);
		
		//Method2: using recursion
		int m=s.length();
		int n=t.length();
		isSubSequence(s,t, m, n);
		

	}
	
	static boolean isSubSequence(String s, String t, int m, int n) {
		
		if(m==0) return true; //base case
		
		if(n==0) return false;
		
		//If lastchar matching		
		if(s.charAt(s.length()-1) == t.charAt(t.length()-1)) {
			return isSubSequence(s,t, m-1,n-1);
		}
		
		//else
		return isSubSequence(s,t, m,n-1);
	}
            


}
