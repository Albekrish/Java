package set1;

/*53) Write a program to give the following output for the given input:
Eg 1:  Input: a1b10
Output: abbbbbbbbbb
Eg: 2:  Input: b3c6d15
           Output: bbbccccccddddddddddddddd
The number varies from 1 to 99.*/

//https://www.youtube.com/watch?v=qFZ0YpW9iSQ
public class StringPrintNo53 {

	public static void main(String[] args) {
		String s="b3c6d15";
		int num=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.length()>i && s.charAt(i)>='0' && s.charAt(i)<='9') {
				char temp=s.charAt(i-1); //to store prev chara
				//to find num
				while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9' ) {
					num=(num*10)+(s.charAt(i)-48);  //to convert char to num ..ascii value for 0=48
					i++;					
				}
				for(int j=0;j<num;j++) {
					System.out.print(temp);
				}				
			}
			num=0;			
		}

	}

}
