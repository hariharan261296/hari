package OOps;

public class Laptop {
	public String priceRange(String laptopName,int startingPrice) {
		if(laptopName=="Dell" && startingPrice>10000) {
			return "Displayed";
		}
		else {
			return "invalid input";
		}
	}
	
	public String pricerange(String laptopName,int startingPrice,int endPrice) {
		if(laptopName=="Dell" && startingPrice>10000 && endPrice<90000) {
			return "Displayed";
		}
		else {
			return "invalid input";
		}
	}

}
