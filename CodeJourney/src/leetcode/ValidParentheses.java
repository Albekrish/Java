package leetcode;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		//String a = "()[]{}";
		//String a= "(]";
		String a="([}}])";

		System.out.println(isValid(a));

	}
	public static boolean isValid(String s) {
		
		if(s.length() % 2!= 0) return false;
		
		Stack<Character> stack=new Stack<>();;
		for(char c: s.toCharArray()) {
			if(c=='(' || c=='{' || c=='[') {
				stack.push(c);
			}else { 
				if(stack.isEmpty()) return false;
				if(c!=')' && stack.peek()=='(') return false;
				if(c!='}' && stack.peek()=='{') return false;
				if(c!=']' && stack.peek()=='[') return false;
				stack.pop();
		}		       
    }
	return stack.isEmpty(); 
	}
}

