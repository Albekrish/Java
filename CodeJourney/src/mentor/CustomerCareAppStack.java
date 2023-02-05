package mentor;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class CustomerCareAppStack {
	
	static Scanner scanner = new Scanner(System.in);
	Stack<Map<Integer,String>> stack = new Stack<>(); //Map<Integer,String>
	
	Map<Integer,String> langList = new LinkedHashMap<>();
	Map<Integer,String> userOptions = new LinkedHashMap<>();
	
	public CustomerCareAppStack() {
		langList.put(1,"Tamil");
		langList.put(2,"English");
		langList.put(3,"French");
		langList.put(0,"Exit");
		userOptions.put(1,"Call Options");
		userOptions.put(2,"Recharge Options");
		userOptions.put(3,"CallerTune Options"); 
		userOptions.put(9,"Previous Menu");
		userOptions.put(0,"Exit");
	}
	
	public static void main(String[] args) {
		CustomerCareAppStack stackApp = new CustomerCareAppStack();
		stackApp.start();
		
	}
	
	public void start() {
		Integer inp = 1;
		Map<Integer, String> currentOption = new HashMap<>();
		currentOption.putAll(langList);
		while (inp != 0) {
			System.out.println("Select option to proceed : " + currentOption.toString());
			inp = scanner.nextInt();
			if(currentOption.containsKey(inp)) {
				if(inp == 9) {
					currentOption = stack.pop();					
					if(stack.isEmpty()) {
						break;
					}
					
				}else {
					stack.push(currentOption);
					
					if(currentOption.containsValue("Tamil") || currentOption.containsValue("English") || currentOption.containsValue("French")){
						currentOption = new HashMap<>();
						currentOption.putAll(userOptions);
					} else if (currentOption.containsValue("Call Options") || currentOption.containsValue("Recharge Options") || currentOption.containsValue("CallerTune Options")){
						currentOption = new HashMap<>();
						currentOption.put(0, "Exit");
						currentOption.put(9, "Previous");
					}
				}					
			}else{
				System.out.println("Please provide the correct input to proceed");
		}
			
		}
	}
	
	

}
