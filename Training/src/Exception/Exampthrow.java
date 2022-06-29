package Exception;

public class Exampthrow {

	public static void main(String[] args) {
		int age=17;
		try {
		if(age>=18) {
			System.out.println("eligible for vote");
		}
		else {
			throw new ArithmeticException("not eligible");
		}}catch(ArithmeticException a) {
		System.out.println(a.getMessage());
			
		}
		System.out.println("hello");
		// TODO Auto-generated method stub

	}

}
