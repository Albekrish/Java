package AbiFirstEvaluation;

import java.util.Arrays;

public class HackerLand3 {

	public static void main(String[] args) {
		int[] expenditure= {2,3,4,2,3,9,8,4,5};
		int n=9, d=5, mid=0, mid_value=0, count=0;
		int[] median= new int[5];
		
		System.arraycopy(expenditure, 0, median, 0, d);
		
		//Find mid value
		if(median.length%2 != 0) {
			mid=(median[0]+median[median.length-1])/2;
			mid_value=median[mid];
			//System.out.println(mid_value);
		}else {
		    mid=(median[0]+median[median.length-1])/2;
			mid_value=(median[mid]+median[mid+1])/2;
		}
		
		
		int[] result=new int[n-d+1];
		System.arraycopy(expenditure, d-1, result, 0, n-d+1);
		System.out.println(Arrays.toString(result));
		
		for(int i=0;i<result.length;i++) {
			if(result[i] >= 2*mid_value) {
				count++;
			}
		}
		System.out.println(count);
	}

}
