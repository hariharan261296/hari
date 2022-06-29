package Hashmapexe;

public class Customer {
	private String name;
	private String email;
	private long accNumber;
	private String panNumber;
	private String gender;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
  public Customer(String name,String email,long accNumber,String panNumber,String gender,int age) {
	  this.name=name;
	  this.email=email;
	  this.accNumber=accNumber;
	  this.panNumber=panNumber;
	  this.gender=gender;
	  this.age=age;
  }
  public String toString() {
	  return "Name: "+name+", "+"email: "+email+", "+"ACCNUMBER: "+accNumber+", "+"PANNUMBER: "+panNumber+", "+"GENDER: "+gender+", "+"AGE: "+age;
  }
  }


