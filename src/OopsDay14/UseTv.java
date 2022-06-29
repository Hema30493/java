package OopsDay14;

class Tv {
	private String brand;
	private int price;
	private String color;
	public Tv(String brand,int price,String color) {
		this.brand=brand;
		this.price=price;
		this.color=color;
	
	}

	public String toString() {
		return "Brand="+brand+", Price="+price+", Color="
				+ ""+color;
	}
}

public class UseTv {
	public static void main(String[] args) {

		
			Tv t1=new Tv("Lg", 30000,"blue");
			Tv t2=new Tv("onida",20000,"black");
			System.out.println(t1);
			System.out.println(t2);		
		}
		
	}


