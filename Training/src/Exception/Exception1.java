package Exception;

public class Exception1 {

	public static void main(String[] args) {
		String a="apple";
		try {
		if(a.contains("a") || a.contains("e") || a.contains("i") || a.contains("o") || a.contains("u")) {
			System.out.println("vowels available");
		}
		else {
			throw new  VowelException("vowel not available");
		}
		// TODO Auto-generated method stub

	}

}
