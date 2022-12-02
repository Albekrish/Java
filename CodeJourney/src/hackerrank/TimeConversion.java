package hackerrank;

public class TimeConversion {

	public static void main(String[] args) {
		String s= "06:40:03PM";
		//Method 1:		
		String str="";		
		String hour=s.substring(0, 2);
		String amPm=s.substring(s.length()-2, s.length());
		if(!hour.equals("12") && amPm.equals("PM")) {
			str= Integer.toString(Integer.parseInt(hour+12));
			s= str+s.substring(2,s.length());
		}
		if(hour.equals("12") && amPm.equals("AM")) {
			str="00";
			s=str+s.substring(2,s.length());
		}
		System.out.println(s.substring(0, s.length()-2));
		
		//Method 2:
		
		//String[] split=s.split(":");
		//String time=split[0];
		//String period=split[split.length].substring(0,split.length-2);
		//normal check
		
	}

}
