package leetcode;
//#6 - Zigzag Conversion 
//https://www.youtube.com/watch?v=l0ndqtvm1ew
public class ZigZagConversion {

	public static void main(String[] args) {
		String s="PAYPALISHIRING";   //op: "PINALSIGYAHRPI"
		int nowRows=4;
		int nowCols=2*(s.length()/nowRows)+1;  //for bigger data col=s.length();
		char[][] out= new char[nowRows][nowCols];
		
		int row=0;
		int col=0;
		int index=0;
		
		while(index< s.length()) {
			while(row<nowRows && index<s.length()) { //row update
				out[row++][col]=s.charAt(index++);
			}
			row=Math.max(0, row-2);
			while(row>0 && index<s.length()) {
				out[row--][++col]=s.charAt(index++);
			}
			col++;
		}
		
		String result="";
		
		for(int i=0;i<nowRows;i++) {
			for(int j=0;j<nowCols;j++) {				
				result += out[i][j];
				result =result.trim();
				System.out.print(out[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("result:"+result);
  }
}	
