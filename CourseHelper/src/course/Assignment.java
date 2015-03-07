package course;

public class Assignment {
	
	// Data
	private String name;
	private double pointsReceived;
	private double pointsWorth;
	private DueDate due;
	
	// Constructors
	public Assignment() {
		
	}
	
	public Assignment(String n) {
		name = n;
	}
	
	public Assignment(String n, DueDate d) {
		name = n;
		due = d;
	}
	
	public Assignment(String n, double pw) {
		name = n;
		pointsWorth = pw;
	}
	
	public Assignment(String n, DueDate d, double pw) {
		name = n;
		due = d;
		pointsWorth = pw;
	}
	
	// Methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPointsReceived() {
		return pointsReceived;
	}

	public void setPointsReceived(double pointsReceived) {
		this.pointsReceived = pointsReceived;
	}

	public double getPointsWorth() {
		return pointsWorth;
	}

	public void setPointsWorth(double pointsWorth) {
		this.pointsWorth = pointsWorth;
	}
	
	public DueDate getDueDate() {
		return due;
	}
	
	public void setDueDate(DueDate d) {
		due = d;
	}
	
	public String toString() {
		return(name);
	}
}
