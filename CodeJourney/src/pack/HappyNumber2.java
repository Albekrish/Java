package pack;

/*Write a program to find and print the first n happy numbers. 
(Happy number - which eventually reaches 1 when replaced by the sum 
of the        square of each digit.)  
Ex : 13 -> 12 + 32 -> 1 + 9 -> 10 -> 1 
13 is a happy number*/

//find reminder and square and add then check if it is one & n=n/10
public class HappyNumber2 {

	public static void main(String[] args) {
			
		for(int i=1;i<=50;i++) {  //1 to 50 range
			int temp=i;
			while(temp!=1 && temp!=4) {
				temp=happyNum(temp);   //store return value in temp to keep on run loop				
			}
			
			if(temp==1) {
				System.out.print(i+" ");
			}
		}
	 }
	
		public static int happyNum(int n) {
			int sum=0,rem=0;
			while(n>0) {
				rem= n%10;		
				sum += (rem*rem);
				n=n/10;
			}			
			return sum;
			
		}
	
}
