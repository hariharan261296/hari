package Exception;

public class Example2 {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c=0;
		
		try {
			c=a/b;
		}catch(ArithmeticException e) {
			System.out.println("please dont divide using zero");
		}
		// TODO Auto-generated method stub
		System.out.println(c);
		System.out.println("working");

	}

}
