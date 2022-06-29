package ObjectLoopConditionDay12;

public class UseShirt {


	public static void main(String[] args) {

	Shirt s1=new Shirt();
	s1.price=3000;
	s1.brand="Otto";
	s1.color="Black";
	

	Shirt s2=new Shirt();
	s2.price=2000;
	s2.brand="England";
	s2.color="white";
	

	Shirt s3=new Shirt();
	s3.price=5000;
	s3.brand="Louiesphilip";
	s3.color="Pink";
	
	Shirt[] shirts= {s1,s2,s3};
	int a1=0;
	int max=0;
	
	String c="";
	String b="";
		for(int i=0;i<shirts.length;i++) {
			if(shirts[i].brand.length()>max) {
				
				max=shirts[i].brand.length();
				b=shirts[i].brand;
				a1=shirts[i].price;
				c=shirts[i].color;
			}
		
		}
		System.out.println("Price:"+a1+" Color: "+c+" highest Brand: "+b);
		
	
	
}

}
