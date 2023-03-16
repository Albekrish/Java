package com.coursemanagement.dto;

public class Course {
	private String course;
	private double money;
	private String trainer;

	public Course(String course, double money, String trainer) {
		this.course = course;
		this.money = money;
		this.setTrainer(trainer);
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	@Override
	public String toString() {
		return "Course [course=" + course + ", money=" + money + ", trainer=" + trainer + "]";
	}

}
