package javapractice;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		HashMap <String,Integer> map= new HashMap<>();
		
		map.put("Abi", 30);
		map.put("Achu", 10);
		
		System.out.println(map);
		System.out.println(map.size());
		
		if(map.containsKey("Abi")) {
			System.out.println(map.get("Abi"));
		}
		
		for(Map.Entry<String,Integer> it:map.entrySet()) {
			System.out.println("key"+it.getKey()+"value"+it.getValue());
		}

	//difference:
		
	/*
	 * Iterator<string> it=list.getIterator() 
	 * while(it.hasNext()) {
	 * System.out.println(it.next()); }
	 */
	}

}
