package com.coursemanagement.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.coursemanagement.dto.Admin;
import com.coursemanagement.dto.Course;
import com.coursemanagement.dto.Student;
import com.coursemanagement.dto.Trainer;

public class Repository {
	//private static final Repository repository = new Repository();
	private static Repository repository =null; 

	List<Student> students = new ArrayList<>();
	List<Admin> admins = new ArrayList<>();
	List<Trainer> trainers = new ArrayList<>();
	List<Course> courses = new ArrayList<>();
	// List<Money> transHistorys=new ArrayList<>();

	public static Repository getInstance() { // singleton class
		if (repository == null) {
			repository = new Repository();
			repository.intialSetup();
		}
		return repository;
	}

	void intialSetup() { // init values for pojo
		students.add(new Student("Abi", "Abi", new Course("Java", 1000.0, "San")));
		students.add(new Student("Harish", "Harish"));
		admins.add(new Admin("Admin", "Admin"));
		trainers.add(new Trainer("San", "San"));
		courses.add(new Course("Java", 1000.0, "San"));

	}

	public boolean checkValidAdmin(String userId, String password) {
		for (Admin admin : admins) {
			if (admin.getUserId().equals(userId) && admin.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	public boolean studentValidation(String userId, String pw) {
		for (Student student : students) {
			if (student.getUserId().equals(userId) && student.getPassword().equals(pw)) {
				return true;
			}
		}
		return false;
	}

	public boolean trainerValidation(String userId, String pw) {
		for (Trainer trainer : trainers) {
			if (trainer.getUserId().equals(userId) && trainer.getPassword().equals(pw)) {
				return true;
			}
		}
		return false;
	}

	public boolean addStudent(String userId, String password) {
		students.add(new Student(userId, password, new Course("Javascript", 1000.0, "Suja")));
		return true;
	}

	public Trainer addNewTrainer(String userName, String password) {
		trainers.add(new Trainer(userName, password));
		for (Trainer trainer : trainers) {
			if (trainer.getUserId().equals(userName)) {
				return trainer;
			}
		}
		return null;
	}

	public Admin addNewAdmin(String userName, String password) {
		admins.add(new Admin(userName, password));
		for (Admin admin : admins) {
			if (admin.getUserId().equals(userName)) {
				return admin;
			}
		}
		return null;
	}

	public List<Course> getcourse(String courseName) {
		List<Course> result = new ArrayList<>();
		if (courseName.equalsIgnoreCase("All")) {
			return courses;
		} else {
			for (Course course : courses) {
				if (course.getCourse().equals(courseName)) {
					result.add(course);
				}
			}
			return result;
		}
	}

	public boolean addCourse(String courseName, double cMoney, String tName) {
		courses.add(new Course("NoSql", 2000.0, "Anu"));
		return true;
	}

	public boolean removeCourse(String courseName) {
		for (Course course : courses) {
			if (course.getCourse().equals(courseName)) {
				course.setCourse("");
				course.setMoney(0);
				course.setTrainer("");
				return true;
			}
		}
		return false;
	}

	public List<Course> viewAssignedCourse(String userId) {
		List<Course> result = new ArrayList<>();
		for (Course course : courses) {
			if (course.getTrainer().equals(userId)) {
				result.add(course);
			}
		}
		return result;
	}

	public boolean enrollcourse(String userId, String courseName) {
		for (Student student : students) {
			if (student.getUserId().equals(courseName)) {
				for (Course course : courses) {
					if (course.getCourse().equals(course)) {
						student.setCourse(course);
						return true;
					}
				}
			}
		}
		return false;
	}

}
