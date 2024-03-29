package leetcode;

import java.util.LinkedList;

/*Given a set of coins and a total money amount. Write a method to compute the smallest number of coins to make up the given amount. If the amount cannot be made up by any combination of the given coins, return -1.

For example:
Given [2, 5, 10] and amount=6, the method should return -1.
Given [1, 2, 5] and amount=7, the method should return 2. */
public class CoinChange {

	public static void main(String[] args) {
		
		int[] coins= {1,2,5};
		int amount=11;
		
		//if(amount==0) return 0;
		
		LinkedList<Integer> amountQueue=new LinkedList<>();
		LinkedList<Integer> stepQueue=new LinkedList<>();
		
		amountQueue.offer(0);
		stepQueue.offer(0);
		
		while(amountQueue.size() >0) {
			int temp=amountQueue.poll();
			int step=stepQueue.poll();
			
			if(temp == amount) {
				System.out.println(step);
				//return step;
			}
			
			for(int coin:coins) {
				if(temp>amount) {
					continue;
				}else {
					if(!amountQueue.contains(temp+coin)) {
						amountQueue.offer(temp+coin);
						stepQueue.offer(step+1);
					}
				}
				
			}
		}
		//return -1;
		
	}

}
