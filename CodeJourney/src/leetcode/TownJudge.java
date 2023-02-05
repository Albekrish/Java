package leetcode;

public class TownJudge {
	
	public static void main(String[] args) {
				
		int[][] trust = {{1,3},{2,3}};
		int n=3, temp=0;
		
		 int[] trust_person = new int[n];
	        int[] trusted = new int[n];
	        for(int i = 0; i < trust.length; i++){
	            int a = trust[i][0]; 
	            int b = trust[i][1];
	            trust_person[a - 1]++;
	            trusted[b - 1]++;
	        }
	        for(int i = 0; i < n; i++){
	            if(trust_person[i] == 0 && trusted[i] == n-1)
	                System.out.println(i+1);
	        }
	        
	        
	}

}
