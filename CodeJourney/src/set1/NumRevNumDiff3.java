package set1;
/*write a program to find the difference between the given number and it's reverse
number.
Example 1: Input : 12345
Output : 12345 - 54321 = -41976
Example 2: Input : 543
Output : 543 - 345 = 198*/
public class NumRevNumDiff3 {

	public static void main(String[] args) {
		int num=12345;
		int rev=0, oNum=num;
		
		while(num>0) {
			int rem= num%10;
			rev =(rev*10)+rem;
			num=num/10;
		}
		
      System.out.println("Rev: "+rev);
      
      int diff= oNum-rev;
      System.out.println("diff: "+diff);
      
	}

}
