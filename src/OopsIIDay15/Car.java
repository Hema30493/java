package OopsIIDay15;

public class Car extends FourWheeler {
	private String color;
	private int price;

	public void setcolor(String color) {
		this.color = color;
	}

	public String getcolor() {
		return color;

	}

	public void setprice(int price) {
		this.price = price;
	}

	public int getprice() {
		return price;
	}

	public Car(String brand, String model, String color, int price) {
		super(brand, model);
		this.color = color;
		this.price = price;
	}

	public String toString() {
		return super.toString() + color + price;

	}

}
