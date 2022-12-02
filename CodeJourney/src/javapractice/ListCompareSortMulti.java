package javapractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student1{
	int age;
	String name;
	
	public Student1(String name,int age) {
		this.age=age;
		this.name=name;
	}
	//Getter &Setter
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	@Override
	public String toString() {
		return this.name+" "+this.age;
	}
}
class SortByAgeName implements Comparator<Student1>{
	@Override
	public int compare(Student1 a,Student1 b) {
		int nameCompare= a.getName().compareTo(b.getName());
		int ageCompare=a.getAge()-b.getAge();
		
		return (nameCompare == 0) ? ageCompare:nameCompare;
	}
}
public class ListCompareSortMulti {

	public static void main(String[] args) {
		
		ArrayList<Student1> ar=new ArrayList<>();
		
		Student1 obj1 = new Student1("Ajay", 27);
        Student1 obj2 = new Student1("Sneha", 23);
        Student1 obj3 = new Student1("Simran", 37);
        Student1 obj4 = new Student1("Ajay", 22);
        Student1 obj5 = new Student1("Ajay", 29);
        Student1 obj6 = new Student1("Sneha", 22);
        
        ar.add(obj1);
        ar.add(obj2);
        ar.add(obj3);
        ar.add(obj4);
        ar.add(obj5);
        ar.add(obj6);
        
        Collections.sort(ar, new SortByAgeName());
        for(int i=0;i<ar.size();i++) {  //custom designed print
        	System.out.println(ar.get(i));
        }
	}

}
