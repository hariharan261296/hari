package Review;

public class Singleton {
	private static Singleton single=new Singleton();
	private Singleton() {
		
	}
	public String name() {
		return "Sham Shantha Kumar";
	}
	public static void main(String[] args) {
		System.out.println(single.name());
	}

}
