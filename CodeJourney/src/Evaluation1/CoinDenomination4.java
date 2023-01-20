package Evaluation1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CoinDenomination4 {


	public static void main(String[] args) {
		int total_amount=56, sum=0;
		boolean flag= true;
		int coins[]= {5,5,5,5};
		int value[]= {1,2,5,10};
		
		int remin= total_amount%value[value.length-1];
		int del= total_amount/value[value.length-1];
		int remain_added=0;		
		
		int total_coin=0;
		if(remin==0) {
			remain_added=Math.abs(total_coin-((del*value[value.length-1])-value[value.length-1]));
			total_coin=del-1;
		}else {
			remain_added=Math.abs(total_amount -(del*value[value.length-1]));
			total_coin=del;
		}
		
		for(int i=value.length-2;i>=0;i--) {
			if(remain_added >= value[i]) {
				remain_added -= value[i];
				total_coin++;
			}else {
				continue;
			}
			if(remain_added <0) {
				flag= false;
				break;
			}else if(remain_added ==0) {
				flag=true;
			}
			
		}
		if(flag) {
			System.out.println(total_coin);
		}else {
			System.out.println(-1);
		}
	}
}


