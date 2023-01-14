package hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DesignerPdfViewer {
	
	 public static int designerPdfViewer(List<Integer> h, String word) {
	       int max=0;	       
	       for(char ch:word.toCharArray()) {
	    	   int temp=ch-97;
	    	   max=Math.max(max, h.get(temp));
	       }
	       return (max*word.length());
	    }
	public static void main(String[] args) {
		Integer[] a= {1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
		String word="abc";
		
		int result= designerPdfViewer(Arrays.asList(a),word);
		
		System.out.println(result);

	}

}
