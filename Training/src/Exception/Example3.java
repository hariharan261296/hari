package Exception;

public class Example3 {

	public static void main(String[] args) {
		String val="hi";
		try {
			int convert=Integer.parseInt(val);
			System.out.println(convert);
		}catch(NumberFormatException npe) {
			System.out.println(npe);
			System.out.println("pass only number inside string");
		}
		// TODO Auto-generated method stub

	}

}
