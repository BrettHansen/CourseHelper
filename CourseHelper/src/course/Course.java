package src.course;

import java.util.ArrayList;
import course.Assignment;


public class Course {
	
	// Data
	private String name;
	private double creditHrs;
	private ArrayList<Assignment> assignments;

	// Constructors
	public Course() {
		
	}
	
	public Course(String n, double ch) {
		name = n;
		creditHrs = ch;
	}

	// Methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCreditHrs() {
		return creditHrs;
	}

	public void setCreditHrs(double creditHrs) {
		this.creditHrs = creditHrs;
	}
	
	public void addAssignment(Assignment a) {
		assignments.add(a);
	}
	
	public Assignment getAssignment(int i) {
		return(assignments.get(i));
	}
	
	public int numberOfAssignments() {
		return assignments.size();
	}
}
