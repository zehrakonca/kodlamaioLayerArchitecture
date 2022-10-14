package kodlamaioLayerArchitecture.entities;

public class Teacher {
	int teacherId;
	String firsName;
	String lastName;
	String branch;
	
	public Teacher(int teacherId, String firsName, String lastName, String branch) {
		super();
		this.teacherId = teacherId;
		this.firsName = firsName;
		this.lastName = lastName;
		this.branch = branch;
	}

	public Teacher() {
		super();
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	
	
}
