package Home;

public class Door {
	private String brand;
	private int price;
	private boolean isWood;
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
	public boolean isWood() {
		return isWood;
	}
	public void setWood(boolean isWood) {
		this.isWood = isWood;
	}
	public Door(String brand, int price, boolean isWood) {
		super();
		this.brand = brand;
		this.price = price;
		this.isWood = isWood;
	}
	@Override
	public String toString() {
		return "";
	}

}
