package pack;
/*Get a date input from the user (dd/mm/yyyy). Write a java program to find
a) whether the given date is in future
b) the first and last day of that month
c) the date after 45 days.
input : 31/07/2022
output :
a) Yes. It is a future date (Today is 10/07/2022)
b) Friday, Sunday  (01/07/2022 - Friday and 31/07/2022 - Sunday)
c) 14/09/2022 - Wednesday*/

//The nextLine() method returns all text up to a line break. The next() method returns tokenized text. 
//The next() method uses whitespace as the default delimiter. You can change the delimiter of the next() method to any valid String.
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DayDate6 {
	
	public static void main(String[] args) throws Exception {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a date in dd/MM/yyyy format : ");
	    String userInp = sc.nextLine();	    
		LocalDate userDate = LocalDate.parse(userInp,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		calculate(userDate);
	}
	
	public static void calculate(LocalDate userDate) {
		
		LocalDate currentDate = LocalDate.now();
		
		DateTimeFormatter printDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter printDayFormat = DateTimeFormatter.ofPattern("EEEE");
		
		// isFuture
		if(userDate.isAfter(currentDate)) 
			System.out.println("Yes. It is a future date (Today is "+currentDate.format(printDateFormat)+")");
		else if(userDate.isBefore(currentDate))
			System.out.println("No. It is a past date (Today is "+currentDate.format(printDateFormat)+")");
		
		// First and Last days
		LocalDate firstDateOfMonth = userDate.withDayOfMonth(1);
		LocalDate lastDateOfMonth = userDate.withDayOfMonth(userDate.getMonth().length(userDate.isLeapYear()));
		System.out.print(firstDateOfMonth.format(printDayFormat)+","+lastDateOfMonth.format(printDayFormat));
		System.out.print(" ("+firstDateOfMonth.format(printDateFormat)+" - "+firstDateOfMonth.format(printDayFormat)+" and ");
		System.out.println(lastDateOfMonth.format(printDateFormat)+" - "+lastDateOfMonth.format(printDayFormat)+")");
		
		// Date + 45
		LocalDate daysAdded = userDate.plusDays(45);
		System.out.println(daysAdded.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - EEEE")));
	}
}