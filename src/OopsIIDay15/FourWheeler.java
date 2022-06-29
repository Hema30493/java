package OopsIIDay15;

public class FourWheeler {
	private String brand;
	private String model;
	public void setbrand(String brand) {
		this.brand=brand;
	}
	public String getbrand() {
		return brand;
	}
		public void setmodel(String model) {
			this.model=model;
		}
		public String getmodel() {
			return model;
		}
		public FourWheeler(String brand, String model) {
			this.brand=brand;
			this.model=model;
		}
		public String toString() {
			return brand+model;
		}
	}
	
		
	


