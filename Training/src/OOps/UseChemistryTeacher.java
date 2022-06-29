package OOps;

public class UseChemistryTeacher {

	public static void main(String[] args) {
		String designation="Teacher";
		String collegeName="XYZCollege";
		String work="Teaching";
		String subject="Chemistry";
		ChemistryTeacher z=new ChemistryTeacher();
		System.out.println(designation+" "+collegeName+" "+z.does(work)+" "+z.mainSubject(subject));
		// TODO Auto-generated method stub

	}

}
