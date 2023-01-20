package leetcode;
//11. Container With Most Water

public class ContainerMoreWater {
	
	public static void main(String[] args) {		
	
	 int[] height= {1,8,6,2,5,4,8,3,7};
	 int left=0;
     int right=height.length-1;
     int max_area=0;
     while(left<right){
         if(height[left]<height[right]){
             max_area=Math.max(max_area, height[left]*(right-left));   
             left++;
         }else{
             max_area=Math.max(max_area, height[right]*(right-left));
             right--;
         }
     }  
    System.out.println(max_area);
	}
}
