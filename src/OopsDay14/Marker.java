package OopsDay14;

public class Marker {
	String brand;
	int price;
	String color;
	public Marker(String brand, int price,String color) {
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	public String toString() {
		return "Brand="+brand+", Price="+price+", Color="
				+ ""+color;
	}
	

}
