package FunctionCallsDay13;

public class Bike {
	int price;
	String brand;
	public String get(Bike b) {
		if(price>b.price) {
			return brand;
		}
		else {
			return b.brand;
	}
}
}


