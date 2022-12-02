package set1;

/*Program to Calculate the Sum of Natural Numbers and find the largest digit of the
sum*/
public class NatuNoAndLarSum34 {

	public static void main(String[] args) {
		int n=5;
		int sum=0;
		//using for loop
		for(int i=1;i<=n;i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//using formula n(n+1)/2
		
		int res= (n*(n+1))/2;
		System.out.println(res);
		int largest=0;
		int smallest=9;
		while(res>0) {
			int rem= res%10;
			largest=Math.max(largest, rem);
			smallest=Math.min(smallest, rem);
			res=res/10;
		}
		System.out.println("Largest-"+largest+" smallest-"+smallest);
	}

}
