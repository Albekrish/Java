package leetcode;

import java.util.ArrayList;
import java.util.List;

//77
public class Combination {	
	    
	    public List<List<Integer>> combine(int n, int k) {
	        int arr[]=new int[n];
	        for(int i=1;i<=n;i++)
	        {
	            arr[i-1]=i;
	        }
	        List<List<Integer>> result=new ArrayList();
	        answer(arr,k,0,n,new ArrayList(),result);
	        return result;
	    }
	    void answer(int[] arr,int k,int start,int size,List current,List<List<Integer>> result)
	    {
	        if(start==size)
	        {
	            if(current.size()==k)
	            {
	                result.add(new ArrayList(current));
	            }
	            return;
	        }
	        current.add(arr[start]);
	        answer(arr,k,start+1,size,current,result);
	        current.remove(Integer.valueOf(arr[start]));
	        answer(arr,k,start+1,size,current,result);
	    }

}
