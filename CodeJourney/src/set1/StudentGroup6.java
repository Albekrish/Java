package set1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Write a program for the following. Let consider 20 students in a class with the roll no
101-120. We are going to split them into four groups. Based on their roll number we are
going to split them with the following logics.
Example 1:
Input : Total Number of students : 20
Output:
Group 1:
101
105
109
113
117
Group 2:
102
106
110
114
118
Group 3:
103
107
111
115
119
Group 4:
104
108
112
116
120*/

public class StudentGroup6 {
	static int totalGroup=4;
	
	static List<Integer> student=new ArrayList<>();
	static Map<Integer,List<Integer>> groupedResults=new HashMap<>();
	
	static {
		for(Integer i=101;i<=120;i++) {
			student.add(i);
		}
	}
	
	public static void main(String[] args) {
		 int currentGroup=1;
		 
		 for(Integer i:student) {
			 if(currentGroup > totalGroup) {
				 currentGroup=1;
			 }
			 
			 List<Integer> groupStudents= groupedResults.get(currentGroup);
			 if(groupStudents == null) groupStudents=new ArrayList<>();
			 
			 groupStudents.add(i);
			 groupedResults.put(currentGroup, groupStudents);
			 currentGroup++;
		 }		 
			 
		 for(Integer i: groupedResults.keySet()) {
			 System.out.println("Group->"+i);			 
			 System.out.println(" Students->"+groupedResults.get(i));
			
		 }
	

	}

}
