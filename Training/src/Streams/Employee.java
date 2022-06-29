package Streams;

public class Employee {
	private String name;
	private int id;
	private String gender;
	private int age;
	private String designation;
	private int salary;
	
	public void setName(String name) {
		this.name=name;
		
	}
	public String getName() {
		return name;
		
	}
	public void setId(int id) {
		this.id=id;
		
	}
	public int getId() {
		return id;
	}
	public void setGender(String gender) {
		this.gender=gender;
		
	}
	public String getGender() {
		return gender;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	public String getDesignation() {
		return designation;
		
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	public Employee(String name, int id, String gender, int age, String designation, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.age = age;
		this.designation = designation;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", gender=" + gender + ", age=" + age + ", designation="
				+ designation + ", salary=" + salary + "]";
	}
	
	
	
	

}
