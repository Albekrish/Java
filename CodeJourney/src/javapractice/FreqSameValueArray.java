package javapractice;

import java.util.Map;
import java.util.TreeMap;
// Largest number in the Array having frequency same as value
public class FreqSameValueArray {

	public static void main(String[] args) {
		int[] arr= {3,3,3,4,4,4,4};
		int n=arr.length;
		
		TreeMap<Integer, Integer> tm=new TreeMap<>();
		//to find num with freq
		for(int i: arr) {
			if(tm.containsKey(i)) {
				tm.put(i, tm.get(i)+1);
			}else {
				tm.put(i, 1);
			}
		}
		System.out.println(tm);
		int max= -1;  //return -1 if no such element
		for(Map.Entry<Integer, Integer> entry : tm.entrySet()) {
			int key=entry.getKey();
			int value=entry.getValue();			
			
			if(key == value) {
				max= Math.max(key, max);
			}			
		}
		System.out.println(max);

	}

}
