package Streams;

public class Student {
	private String name;
	private int id;
	private String gender;
	private char section;
	private int mark;
	
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
	public void setSection(char section) {
		this.section=section;
	}
	public char getSection() {
		return section;
		
	}
	public void setMark(int mark) {
		this.mark=mark;
	}
	public int getMark() {
		return mark;
	}
	
	public Student(String name, int id,String gender,char section,int mark) {
		this.name=name;
		this.id=id;
		this.gender=gender;
		this.section=section;
		this.mark=mark;
	}
	public String toString() {
		return "Name= "+name+", "+"ID= "+id+", "+"GENDER= "+gender+", "+"SECTION= "+section+", "+"MARK= "+mark;
	}
		
	}
	


