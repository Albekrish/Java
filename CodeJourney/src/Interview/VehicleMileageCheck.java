package Interview;

import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class VehicleMileageCheck {
	
	public static void main(String[] args) {
		Map<Integer, String> mileage=new TreeMap<>(Collections.reverseOrder()); //fuel/km, vehiclename
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the no. of bikes");
//		int n=sc.nextInt();
//		
//		for(int i=1;i<=n;i++) {
//			System.out.println("Enter bike name");
//			String bike=sc.next();
//			System.out.println("Enter fuel/km");
//			int fuel= sc.nextInt();
//			mileage.put(fuel, bike);
//		}
				
		mileage.put(22, "Honda");
		mileage.put(19, "Apache");
		mileage.put(30, "Mahendra");
		
		System.out.println(mileage);
		
		
		
	}
}
