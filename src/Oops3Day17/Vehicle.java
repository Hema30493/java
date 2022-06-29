package Oops3Day17;

public abstract class Vehicle {
	String brand;
	int price;
	public String breaking() {
	return "Break is applied vehicle is stopped";
	}
	abstract public String showSpeed(int speed);
	public String toHorn() {
		return "Horning";
	}
}


