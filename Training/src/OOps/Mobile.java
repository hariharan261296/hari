package OOps;

public class Mobile {
	private String color;
	private int price;
	private boolean isWarranty;
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
	public boolean isWarranty() {
		return isWarranty;
	}
	public void setWarranty(boolean isWarranty) {
		this.isWarranty = isWarranty;
	}
	public Mobile(String color, int price, boolean isWarranty) {
		
		this.color = color;
		this.price = price;
		this.isWarranty = isWarranty;
	}
	@Override
	public String toString() {
		return ""+price;
	}

}
