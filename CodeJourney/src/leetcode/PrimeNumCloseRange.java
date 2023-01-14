package leetcode;

import java.util.Arrays;

class PrimeNumCloseRange {
   public static boolean findPrime(int n ){
        if(n==1){
            return false;
        }
        for(int i =2;i<=(n/2);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] arg){
    	int left=10;
    	int right=19;
        int range = Integer.MAX_VALUE;
        int startPtr =left;
        int ptr = startPtr;
        int[] result = new int[]{-1,-1};
        boolean startPtrbool = false;
        for(int i = left;i<=right;i++){
            if(findPrime(i)){
                startPtr = ptr;
                ptr = i;
                if(startPtrbool || findPrime(startPtr))
                    startPtrbool = true;
            }
            if(startPtr<ptr){
                if(startPtrbool){
                    int temp = ptr - startPtr;
                    if(temp<range){
                        result[0]= startPtr;
                        result[1]=ptr;
                        range = temp;
                    }
                    if(range==2 || range ==1){
                        break;
                    }
                }
            }
              
        } 
        System.out.println(Arrays.toString(result));  
    }
}

