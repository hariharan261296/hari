package Exception;

public class Exception {

	public static void main(String[] args) {
		int age=17;
		try {
			if(age>=18) {
				System.out.println("eligible");
			}
			else {
				throw new AgeException("not eligoble");
			}
		}catch(AgeException a) {
			System.out.println(a.getMessage());
		}
		// TODO Auto-generated method stub

	}

}
