package course;
import java.util.*;


public class Semester {
	// Data
	private String name;
	private ArrayList<Course> courses = new ArrayList<Course>(0);
	private static String[] LETTER_GRADES = {"A+","A","A-","B+","B","B-","C+","C","D","F"};
	private static double[] GRADE_POINTS = {4.33, 4, 3.67, 3.33, 3, 2.67, 2.33, 2, 1, 0};

	// Constructors
	public Semester(String name) {
		this.name = name;
	}
	
	// Methods
	public String getName() {
		return name;
	}
	
	public int getNumCourses() {
		return courses.size();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addCourse(Course c) {
		courses.add(c);
	}
	
	public void addCourse(String name, double hrs) {
		courses.add(new Course(name, hrs));
	}
	
	public Course getCourse(int i) {
		return courses.get(i);
	}
}

