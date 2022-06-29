package ObjectLoopConditionDay12;

public class UseBike {
	public static void main(String[] args) {
		Bike b1=new Bike();

		b1.price=80000;
		b1.brand="pulsur";
		b1.color="Black";
		
		Bike b2=new Bike();
		b2.price=70000;
		b2.brand="Hero";
		b2.color="blue";
		
		Bike b3=new Bike();
		b3.price=60000;
		b3.brand="Honda";
		b3.color="Black";
		
		Bike[] bikes= {b1,b2,b3};
		
	int max=0;
	String a="";
	String c="";
		for(int i=0;i<bikes.length;i++) {
			if(bikes[i].price>max) {
				max=bikes[i].price;
				a=bikes[i].brand;
				c=bikes[i].color;
			}
		
		}
		System.out.println("Brand:"+a+" Color: "+c+" Highest price"+max);
		
	}

}
