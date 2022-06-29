package OOps;

public class Kettle {
	private String brand;
	private int price;
	private float capacity;
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
	public float getCapacity() {
		return capacity;
	}
	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}
	public Kettle(String brand, int price, float capacity) {
		
		this.brand = brand;
		this.price = price;
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "";
	}

}
