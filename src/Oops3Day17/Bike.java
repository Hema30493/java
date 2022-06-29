package Oops3Day17;

public class Bike extends Vehicle {
	public String showSpeed(int speed) {
		if(speed>=10 && speed<=20) {
			return "Slow Speed";
		}
		else if(speed>20 && speed<=60) {
			return "Normal Speed";
		}
		else if(speed>60 && speed<=120) {
			return "High speed";
		}
		else {
			return "invalid Speed";
		}
	}
	

}
