package Home;

public class Mobile {
	private String brand;
	private int price;
	private boolean isAndroid;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isAndroid() {
		return isAndroid;
	}
	public void setAndroid(boolean isAndroid) {
		this.isAndroid = isAndroid;
	}
	public Mobile(String brand, int price, boolean isAndroid) {
		super();
		this.brand = brand;
		this.price = price;
		this.isAndroid = isAndroid;
	}
	@Override
	public String toString() {
		return brand+","+(price-999)+","+isAndroid;
	}
     
}
