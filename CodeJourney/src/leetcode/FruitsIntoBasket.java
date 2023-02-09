package leetcode;

import java.util.HashMap;

public class FruitsIntoBasket {

	public static void main(String[] args) {
		//int[] fruits= {1,2,3,2,2};
		int[] fruits= {3,3,3,1,2,1,1,2,3,3,4};
		
		HashMap<Integer, Integer> hm=new HashMap<>();
		int firstIndex=0;
		int max=0;
		
		for(int i=0;i<fruits.length;i++) {
			hm.put(fruits[i], hm.getOrDefault(fruits[i], 0)+1);
			if(hm.size()>2) {
				hm.put(fruits[firstIndex], hm.get(fruits[firstIndex])-1);
				if(hm.get(fruits[firstIndex]) ==0) {
					hm.remove(fruits[firstIndex]);
				}
				firstIndex++;
			}
			max=Math.max(max, i-firstIndex+1);
		}
		
		System.out.println(max);
	}

}

//
//if(fruits.length<3)
//    return fruits.length;
//int frooti=0;
//int[] slice = {-1,-1};
//for(int i=0; i<fruits.length-1; i++)
//{
//    int count = 1;
//    slice[0] = fruits[i];
//    slice[1] = -1;
//    for(int j=i; j<fruits.length; j++)
//    {
//        if(fruits[j]==slice[0] || fruits[j]==slice[1])
//            count++;
//        else if(slice[1]==-1)
//        {
//            slice[1] = fruits[j];
//            count++;
//        }
//        else
//            break;
//    }
//    if(count>frooti)
//        frooti = count;
//}
//return frooti-1;
//
