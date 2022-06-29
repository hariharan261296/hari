package OOps;

public class Teacher {
	private String designation;
	private String collegeName;
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String does(String work) {
		return "Teaching";
	}

}
