package abiApp;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class QueueApp {

	Queue<String> candidateQueue = new LinkedList<>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		QueueApp queueApp = new QueueApp();
		Integer inp = 0;
		
		while (inp != 3) {
			System.out.println("Enter option to proceed : \n  1. Add Candidate \n  2. Get Candidate \n  3. Quit");
			inp = scanner.nextInt();
			switch (inp) {
				case 1: {
					queueApp.addCandidate(); break;
				}
				case 2: {
					queueApp.getCandidate(); break;
				}
				case 3:{ break;	}
				default:
					System.out.println("Provide a valid option");
				}
		}

	}
	
	public void addCandidate() {
		System.out.println("Enter Candidate Name");
		String name = scanner.next();
		candidateQueue.add(name);
	}
	
	public void getCandidate() {
		if(!candidateQueue.isEmpty())
			System.out.println("Next candidate for interview : "+candidateQueue.remove());
		else
			System.out.println("No candidate in queue");
	}
}
