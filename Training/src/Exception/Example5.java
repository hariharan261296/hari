





package Exception;

public class Example5 {

	public static void main(String[] args) {
		String value=null;
		try {
		int len=value.length();
		System.out.println(len);
		}catch(NullPointerException a) {
			System.out.println(a);
			System.out.println("only String value");
		}
		
		// TODO Auto-generated method stub

	}

}
