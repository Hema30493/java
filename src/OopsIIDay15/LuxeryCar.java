package OopsIIDay15;

public class LuxeryCar extends Car {
	private boolean isAutomatic;
	
	public void setisAutomatic(boolean isAutomatic) {
		this.isAutomatic=isAutomatic;
	}

	public boolean getisAutomatic() {
		return isAutomatic;

	}

	public LuxeryCar(String brand, String model, String color, int price, boolean isAutomatic) {
		super(brand, model,color,price);
		
		this.isAutomatic=isAutomatic;
	}

	public String toString() {
		return super.toString()+isAutomatic;

	}

}
