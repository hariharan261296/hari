package StringsExample;

public class ConditionExp2 {

	public static void main(String[] args) {
		int age=40;
		if(age<5) {
			System.out.println("Child");
		}
		else if(age<18) {
			System.out.println("Teenage");
		}
		else if(age>=40) {
			System.out.println("Adult");
		}
		else if(age>45) {
			System.out.println("Old age");
		}
		else {
			System.out.println("invalid");
		}
	}

}
