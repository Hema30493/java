package FunctionCallsDay13;

public class UseCar {
	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.price=500000;
		Car c2=new Car();
		c2.price=700000;
		System.out.println(c1.max(c1.price,c2.price));
		
		
		
	}

}
