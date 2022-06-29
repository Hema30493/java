package OopsDay14;

class Ram {
	private String brand;
	private int gb;
	public Ram (String brand,int gb) {
		this.brand=brand;
		this.gb=gb;
	}
	public String toString() {
		return brand+", "+gb;
	}
}

class Phone {
	private String brand;
	private int price;
	private String model;
	private Ram ram;

	public Phone(String brand,int price,String model,Ram ram) {
		this.brand=brand;
		this.price=price;
		this.model=model;
		this.ram=ram;
	}
	public String toString() {
		return brand+", "+price+", "+model+", "+ram;
	}
}


public class UsePhone {
	public static void main(String[] args) {

		Ram r1=new Ram("XI",8);
		Ram r2=new Ram("XII",16);
		Ram r3=new Ram("XIII",32);
			Phone p1=new Phone("vivo", 50000,"blue",r1);
			Phone p2=new Phone("Apple",80000,"black",r2);

			Phone p3=new Phone("Oppo",40000,"white",r3);
			
			System.out.println(p1);
			System.out.println(p2);	
			System.out.println(p2);		
			
		}
		
	}


