package Oops3Day17;

public class UseBike {
	public static void main(String[] args) {
		Bike b=new Bike();
		b.brand="Pulsar";
		b.price=90000;
		System.out.println(b.brand+", "+b.price+", "+b.breaking()+", "+b.showSpeed(70)+", "+b.toHorn());
	}

}
