package Exception;

public class Exp6 {
	public static void main(String[] arga) {
		int[] num= {10,20,30,40};
		try {
			System.out.println(num[4]);	
		}catch(ArrayIndexOutOfBoundsException a) {
	System.out.println("dont put value out of index");
	}
	}
}


