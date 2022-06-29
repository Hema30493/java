package OopsDay14;

public class UseLaptop {
	public static void main(String[] args) {
		Processor p=new Processor();
		p.brand="intel";
		p.core=5;
		
		Laptop l1=new Laptop();
		l1.brand="Dell";
		l1.price=50000;
		l1.color="Black";
		l1.processor=p;
		System.out.println(l1.brand+", "+l1.price+", "+l1.color+", "+l1.processor.brand+", "+l1.processor.core);
	}

}
