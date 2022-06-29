package Stream;

public class Laptop {
	private String brand;
	private int price;
	private String processor;
public void setbrand(String brand) {
	this.brand=brand;
}
public String getbrand() {
	return brand;
}
public void setprice(int price) {
	this.price=price;
}
public int getprice() {
	return price;
}

public void setprocessor(String processor) {
	this.processor=processor;
}
public String getprocessor() {
	return processor;
}

public Laptop(String brand, int price, String processor) {
	this.brand=brand;
	this.price=price;
	this.processor=processor;
}
public String toString() {
	return brand+price+processor;
}
}
