package leetcode;

/*Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.*/

public class LengthOfLastWord {

	public static void main(String[] args) {
		String str= "   fly me   to   the moon  ";
		
		System.out.println(lengthOfLastWord(str));
	}
	
	public static int lengthOfLastWord(String s) {
		
		//method 1
		//String[] words= s.split(" ");
		//return words.length == 0? 0:words[words.length-1].length();
		
	    //method 2
		return s.trim().length()-s.trim().lastIndexOf(" ")-1;
		
			
	}
}
