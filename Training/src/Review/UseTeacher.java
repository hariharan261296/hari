package Review;

public class UseTeacher {

	public static void main(String[] args) {
		Teacher.change();
		Teacher t1=new Teacher();
		Teacher t2=new Teacher();
		Teacher t3=new Teacher();
		t1.idno=456;
		t2.name="roopa";
		t3.schoolName="St peter matriculation higher secondary school";
		System.out.println(t1.idno+", "+t2.name+", "+t3.schoolName);
		
		
		// TODO Auto-generated method stub

	}

}
