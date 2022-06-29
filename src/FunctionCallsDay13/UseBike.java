package FunctionCallsDay13;

public class UseBike {
	public static void main(String[] args) {
		Bike b1=new Bike();
		b1.price=70000;
		b1.brand="Pulsur";
		Bike b2=new Bike();
		b2.price=50000;
		b2.brand="Honda";
		System.out.println(b1.get(b2));
	}

}
