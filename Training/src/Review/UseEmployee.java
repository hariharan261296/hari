package Review;

public class UseEmployee {

	public static void main(String[] args) {
		
	
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		e1.empid=456;
		e2.name="Sham";
		Employee.companyName="Infosys";
		System.out.println(e1.empid+", "+e2.name+", "+Employee.companyName);
		// TODO Auto-generated method stub

	}

}
