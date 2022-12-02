/*Write a Program for BMI (Body Mass Index) calculator. he BMI is defined
as the body mass divided by the square of the body height and is universally
expressed in units of kg/m2, resulting from the mass in kilograms and height
in meters. The formula is:
BMI = (mass or weight)/(height*height)
where,
mass or weight is in Kg,
height is in meters*/


package pack;

import java.util.Scanner;

public class BodyMassIndex20 {

	public static double BMI(double weight, double height)
	{
		double bmi= weight/Math.pow(height, 2);
		return bmi;
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the weight in kg:");
		double weight= sc.nextDouble();
		
		System.out.print("Enter height in meters:");
		double height=sc.nextDouble();
		
		double bmi= BMI(weight,height);
		
		if(bmi<18.5) 		
			 System.out.print("underweight");	
		else if(bmi>=18.5 && bmi<24.9)
			 System.out.print("healthy");	
		else if(bmi>=24.9 && bmi<30)
			 System.out.print("overweight");
		else
			 System.out.print("obesity");	
			
	}

	
}
