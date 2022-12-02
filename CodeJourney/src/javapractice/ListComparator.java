package javapractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	int rollNo;
	String name, address;
	
	//Constructor
	public Student(int rollNo,String name,String address) {
		this.rollNo=rollNo;
		this.name=name;
		this.address=address;
	}
	
	//to print
	public String toString() {
		return this.rollNo+" "+this.name+" "+this.address;
	}
	
}

class SortByRollno implements Comparator<Student>{
	
	public int compare(Student a, Student b) {
		return a.rollNo-b.rollNo;    //ascending order
		//descending b-a
	}
}
class SortByName implements Comparator<Student>{
	
	public int compare(Student a,Student b) {
		return a.name.compareTo(b.name);
	}
	
}
public class ListComparator {
// Compare method returns -1, 0, or 1 to say if it is less than, equal, 
	//or greater to the other.
	public static void main(String[] args) {
		
		ArrayList<Student> ar=new ArrayList<>();
		
		ar.add(new Student(111, "Mayank", "london"));
		ar.add(new Student(131, "Anshul", "nyc"));
        ar.add(new Student(121, "Solanki", "jaipur"));
        ar.add(new Student(101, "Aggarwal", "Hongkong"));
        
        System.out.println(ar); //predefine print method 
        
        Collections.sort(ar, new SortByRollno());
        System.out.println(ar);
        
        Collections.sort(ar, new SortByName());
        //or
        //ar.sort(new SortByName());
        
        for(int i=0;i<ar.size();i++) {  //custom designed print
        	System.out.println(ar.get(i));
        }
	}

}
