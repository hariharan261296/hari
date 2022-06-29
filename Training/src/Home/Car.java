package Home;

public class Car {
	private int noOfSeats;
	private String brand;
	private int price;
	private int enginecc;
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
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
	public int getEnginecc() {
		return enginecc;
	}
	public void setEnginecc(int enginecc) {
		this.enginecc = enginecc;
	}
	public Car(int noOfSeats, String brand, int price, int enginecc) {
		super();
		this.noOfSeats = noOfSeats;
		this.brand = brand;
		this.price = price;
		this.enginecc = enginecc;
	}
	@Override
	public String toString() {
		return "";
	}

}
