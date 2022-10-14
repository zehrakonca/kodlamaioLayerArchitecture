package kodlamaioLayerArchitecture.entities;

public class Course {
	public int courseId;
	public String courseName;
	public String category;
	public double price;
	
	public Course() {
		super();
	}

	public Course(int courseId, String courseName, String category, double price) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.category = category;
		this.price = price;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
