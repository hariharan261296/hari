package Review;

public interface Example {
	public  void divide(int a,int b);
		default void show() {
			System.out.println("default");
	}

}
