package Home;

public class Marker {
	private String color;
	private int price;
	private boolean isPermanent;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isPermanent() {
		return isPermanent;
	}
	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}
	public Marker(String color, int price, boolean isPermanent) {
		super();
		this.color = color;
		this.price = price;
		this.isPermanent = isPermanent;
	}
	@Override
	public String toString() {
		return "";
	}

}
