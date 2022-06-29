package Exception;

public class Exp7 {

	public static void main(String[] args) {
		String name="onesoft";
		try {
			System.out.println(name.charAt(7));	
		}catch(StringIndexOutOfBoundsException a) {
			System.out.println("dont put character out of index");
		}
		// TODO Auto-generated method stub

	}

}
