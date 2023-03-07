package Interview;

import java.util.Scanner;

public class EvenPrintNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int input = n + 1;
		

		for (int i = input; i < 100; i++) {
			if (checkPrime(i)) {
				break;
			} else {
				if (i % 2 == 0) { // even num
					System.out.println("Even:" + i);
				} else {
					System.out.println("Odd:" + i);
				}
			}
		}
	}

	public static boolean checkPrime(int n) {
		boolean flag = true;
		for (int num = 2; num <= n; num++) {
			flag = true;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = false;
				}
			}
		}
		return flag;
	}
}
