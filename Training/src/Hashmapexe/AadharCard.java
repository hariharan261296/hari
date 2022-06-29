package Hashmapexe;

public class AadharCard {
	private String name;
	private int age;
	private long aadharNumber;
	private String gender;
	private String fatherName;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber=aadharNumber;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setGender(String gender) {
		this.gender=gender;
		
	}
	public String getGender() {
		return gender;
		
	}
	public void setFatherName(String fatherName) {
		this.fatherName=fatherName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public AadharCard(String name,int age,long aadharNumber,String gender,String fatherName) {
		this.name=name;
		this.age=age;
		this.aadharNumber=aadharNumber;
		this.gender=gender;
		this.fatherName=fatherName;
	}
	public String toString() {
		return "NAME: "+name+", "+"AGE: "+age+", "+"AADHAR NUMBER: "+aadharNumber+", "+"GENDER: "+gender+", "+"FATHER NAME: "+fatherName;
	
		
	}
}