package OopsDay14;

class Compressor {

	private String model;
	private int capacity;
	public Compressor(String model, int capacity) {
		this.model=model;
		this.capacity=capacity;
	}
	public String toString() {
		return model+","+capacity;
		
	}
		
	}
class Ac {
	private String brand;
	private int price;
	private String color;
	private Compressor compressor;
	
	public Ac(String brand, int price,String color, Compressor compressor) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.compressor=compressor;
	}
	public String toString() {
		return brand+", "+price+", "+color+","+compressor;
	}
	
	
}


public class UseAc {
	public static void main(String[] args) {

		Compressor c1=new Compressor("XI",3);
		Compressor c2=new Compressor("XII",5);
		Compressor c3=new Compressor("XIII",3);
			Ac a1=new Ac("Samsung", 50000,"blue",c1);
			Ac a2=new Ac("Lg",80000,"black",c2);
			Ac a3=new Ac("Onida",40000,"white",c3);
			
			System.out.println(a1);
			System.out.println(a2);	
			System.out.println(a2);		
			
		}
		
	}


