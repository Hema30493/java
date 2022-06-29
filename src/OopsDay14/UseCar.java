package OopsDay14;

public class UseCar {
	public static void main(String[] args) {
		Engine e=new Engine();
		e.brand="Motor";
		e.model="Mt01";
		Car c1=new Car();
		c1.brand="Audi";
		c1.price=5000000;
		c1.color="black";
		c1.engine=e;
		Car c2=new Car();
		c2.brand="Honda";
		c2.price=3000000;
		c2.color="White";
		c2.engine=e;
		
		System.out.println(c1.brand+", "+c1.price+", "+c1.color+", "+c1.engine.brand+", "+c1.engine.model);

		System.out.println(c2.brand+", "+c2.price+", "+c2.color+", "+c2.engine.brand+", "+c2.engine.model);
	
	}

}
