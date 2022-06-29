package OopsDay14;

class Pen {
	private String brand;
	private int price;
	private String color;

	public Pen(String brand, int price,String color) {
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	public String toString() {
		return "Brand="+brand+", Price="+price+", Color="
				+ ""+color;
	}
	

}
public class UsePen {
	public static void main(String[] args) {

		
			Pen p1=new Pen("Hero", 30,"blue");
			Pen p2=new Pen("Natraj",40,"black");
			System.out.println(p1);
			System.out.println(p2);		
		}
		
	}



