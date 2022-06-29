package Oops3Day17;

public class TamilNadu extends CentralGov {
	public String stateCode(String code) {
		return code;
	}
	public void noPlateColor(String color) {
		switch(color) {
		case "Green with white" :
			System.out.println("Electric vehicle");
			break;
		case "yellow with black" :
			System.out.println("Public vehicle");
			break;
		case "white with black" :
			System.out.println("Private vehicle");
			break;
			default:
				System.out.println("invalid color");
		}
		
		}
		
	}
	
	


