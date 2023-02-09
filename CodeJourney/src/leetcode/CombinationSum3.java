package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum3 {
	    void answer(int[] arr,int sum,int size,int cid,List<Integer> list,Set<List<Integer>> result)
	    {
	        if(list.size()==size)
	        {
	            int ss=0;
	            for(int i:list)
	            {
	                ss+=i;
	            }
	            if(ss==sum)
	            {
	                result.add(new ArrayList(list));
	                return;
	            }
	            return;
	        }
	        if(cid==arr.length)
	        {
	            return;
	        }
	        list.add(arr[cid]);
	        answer(arr,sum,size,cid+1,list,result);
	        list.remove(list.size()-1);
	        answer(arr,sum,size,cid+1,list,result);
	    }
	    public List<List<Integer>> combinationSum3(int k, int n) {
	       int[] arr={1,2,3,4,5,6,7,8,9};
	       Set<List<Integer>> result=new HashSet();
	       answer(arr,n,k,0,new ArrayList(),result);
	       List<List<Integer>> answer=new ArrayList();
	        answer.addAll(result);
	        return answer;
	    }
	
}
