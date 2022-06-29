package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee("sham",458,"male",20,"manager",20000);
		Employee e2=new Employee("hari",457,"male",30,"junior engineer",30000);
		Employee e3=new Employee("kavin",888,"male",26,"data analyst",45000);
		Employee e4=new Employee("sathish",456,"male",45,"production engineer",50000);
		Employee e5=new Employee("jefrin",785,"female",36,"senior engineer", 70000);
		Employee e6=new Employee("ragul",254,"male",55,"project manager",80000);
		Employee e7=new Employee("shina",235,"female",48,"assitant manager",100000);
		ArrayList<Employee>employees=new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e7);
	//	List<Employee>femaleList=employees.stream().filter((x)->x.getGender().equals("female")).collect(Collectors.toList());
		//femaleList.forEach(y->System.out.println(y));
		
	//	List<Employee>highSalariedEmployees=employees.stream().filter((emp)->emp.getSalary()>30000).collect((Collectors.toList()));
		
		//highSalariedEmployees.forEach(x->System.out.println(x));
		
	//	employees.stream().filter((male)->male.getGender().equals("male")).forEach(x->System.out.println(x));
		
	//	long maleEmployeeCount=employees.stream().filter(x->x.getGender().equals("male")).count();
	//	System.out.println(maleEmployeeCount);
		
	//	List<Employee>femaleEmployees=employees.stream().filter((y)->y.getGender().equals("female")).collect(Collectors.toList());
	//	long femaleEmployeeCount=employees.stream().filter(x->x.getGender().equals("female")).count();
	//	System.out.println(femaleEmployeeCount);
		// TODO Auto-generated method stub
		List<String>sham=employees.stream().filter((s)->s.getGender().equals("female")).map((h)->h.getName()).collect(Collectors.toList());
sham.forEach((z)->System.out.println(z));
	}

}
