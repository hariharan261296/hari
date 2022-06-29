package Exception;

public class Ex8 {

	public static void main(String[] args) {
		String x="hi";
		String y="10";
		int z=0;
		int a=0;
		int b=0;
		try {
			z=x.length();
			a=Integer.parseInt(x);
			b=Integer.parseInt(y);
		}catch(NullPointerException u) {
			System.out.println("only String value");
		}catch(NumberFormatException t) {
			System.out.println("dont pass inside string");
		}catch(Exception r) {
			System.out.println("check value");
		}
		System.out.println("hi");
		int[] c= {a,b};
		try {
			System.out.println(c[1]);
			System.out.println(c[3]);
		}catch(IndexOutOfBoundsException id) {
			System.out.println("please check inside string");
		}finally {
		System.out.println(z);
		System.out.println("helloworld");
		}
		// TODO Auto-generated method stub

	}

}
