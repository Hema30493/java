package ObjectLoopConditionDay12;

public class UseLaptop {


	public static void main(String[] args) {

	Laptop a1=new Laptop();

	a1.price=80000;
	a1.brand="Dell";
	a1.color="Black";

	Laptop a2=new Laptop();

	a2.price=60000;
	a2.brand="acer";
	a2.color="Black";
	

	Laptop a3=new Laptop();

	a3.price=70000;
	a3.brand="Hp";
	a3.color="Black";
	
	Laptop[] laps= {a1,a2,a3};

	int min=laps[0].price;
	String a="";
	String c="";
		for(int i=0;i<laps.length;i++) {
			if(laps[i].price<min) {
				min=laps[i].price;
				a=laps[i].brand;
				c=laps[i].color;
			}
		
		}
		System.out.println("Brand:"+a+" Color: "+c+" Highest price"+min);
		
	
	}

}
