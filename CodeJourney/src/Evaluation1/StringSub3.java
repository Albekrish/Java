package Evaluation1;

public class StringSub3 {

	public static void main(String[] args) {
		
			String[] x= {"ceo", "alco", "caaeio", "ceai"};
			String[] y= {"ec","oc","ceo"};
			int result=0,count=0;
			int fresult=0;
			for(String str1: x) {
				for(String str2: y) {
					char[] ch1=str1.toCharArray();
					char[]ch2=str2.toCharArray();
					
					if(compareChar(ch1,ch2) == 1) { //only if match found we will continue
						count = count+1;
					}else {
						break;
					}
					if(count == y.length) {
						fresult+=1;
					}
				}
				count=0;
			}
			
			System.out.println(fresult);
	}

 public static int compareChar(char[] ch1, char[] ch2) {  //to check char comparision
	 int count=0;
	 for(int i=0;i<ch1.length;i++) {
			for(int j=0;j<ch2.length;j++) {
				if(ch1[i] ==ch2[j]) {
					count++;
				}
			}						
		}
	 
	 if(count == ch2.length) {
		return 1; 
	 }else {
		 return 0;
	 }
	 
 }
 
}