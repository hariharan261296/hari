package OOps;

public class UseLaptop {

	public static void main(String[] args) {
		String laptopName="Dell";
		int startingPrice=11000;
		int endPrice=70000;
		Laptop lap=new Laptop();
		System.out.println(lap.priceRange(laptopName, startingPrice)+" "+lap.pricerange(laptopName, startingPrice, endPrice));
		
		
		// TODO Auto-generated method stub

	}

}
