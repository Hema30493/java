package ObjectArrayday10;

public class UseBike {

	public static void main(String[] args) {
		Bike b1=new Bike();
		b1.price=80000;
		b1.brand="pulsur";
		b1.color="Black";
		b1.mileage=25.5f;
		b1.cc=120;
		

		Bike b2=new Bike();
		b2.price=70000;
		b2.brand="Hero";
		b2.color="blue";
		b2.mileage=20.5f;
		b2.cc=120;
		

		Bike b3=new Bike();
		b3.price=60000;
		b3.brand="Honda";
		b3.color="Black";
		b3.mileage=22.5f;
		b3.cc=120;
		

		Bike b4=new Bike();
		b4.price=90000;
		b4.brand="pulsur";
		b4.color="red";
		b4.mileage=20.52f;
		b4.cc=120;
		

		Bike b5=new Bike();
		b5.price=75000;
		b5.brand="Scooty";
		b5.color="pink";
		b5.mileage=21.5f;
		b5.cc=100;
		
		Bike b6=new Bike();
		b6.price=85000;
		b6.brand="Suzuki";
		b6.color="white";
		b6.mileage=19.52f;
		b6.cc=100;
		
		Bike[] bikes= {b1,b2,b3,b4,b5,b6};
		for(int i=0;i<bikes.length;i++) {
			System.out.println(bikes[i].price+" "+bikes[i].brand+" "+bikes[i].color+" "+bikes[i].mileage+","+bikes[i].cc);
		}
		
		System.out.println(" ");
		

		for(int i=bikes.length-1;i>=0;i--) {
			System.out.println(bikes[i].price+" "+bikes[i].brand+" "+bikes[i].color+" "+bikes[i].mileage+","+bikes[i].cc);
		}
		

		System.out.println(" ");
		
		for(int i=0;i<bikes.length/2;i++) {
			System.out.println(bikes[i].price+" "+bikes[i].brand+" "+bikes[i].color+" "+bikes[i].mileage+","+bikes[i].cc);
		}

		System.out.println(" ");
		

		for(int i=bikes.length-1;i>=bikes.length/2;i--) {
			System.out.println(bikes[i].price+" "+bikes[i].brand+" "+bikes[i].color+" "+bikes[i].mileage+","+bikes[i].cc);
		}
	}

}
