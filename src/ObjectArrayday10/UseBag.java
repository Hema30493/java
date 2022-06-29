package ObjectArrayday10;

public class UseBag {
	public static void main(String[] args) {
		Bag b1=new Bag();
		b1.brand="Hp Bag";
		b1.price=1500;
		b1.color="Black";
		b1.weight=3.5f;
		b1.isWarranty=true;
		Bag b2=new Bag();
		b2.brand="accer Bag";
		b2.price=1800;
		b2.color="Blue";
		b2.weight=2.5f;
		b2.isWarranty=false;

		Bag b3=new Bag();
		b3.brand="Dell Bag";
		b3.price=2500;
		b3.color="Pink";
		b3.weight=2.8f;
		b3.isWarranty=true;
		
		Bag[] bags= {b1,b2,b3};
		
		for(int i=0;i<bags.length;i++) {
			System.out.println(bags[i].brand+","+bags[i].price+","+bags[i].color+","+bags[i].weight+","+bags[i].isWarranty);
		}
		
		System.out.println(" ");
		
		for(int i=bags.length-1;i>=0;i--) {

			System.out.println(bags[i].brand+","+bags[i].price+","+bags[i].color+","+bags[i].weight+","+bags[i].isWarranty);
		
		}

		System.out.println(" ");
		
		for(int i=0;i<bags.length/2;i++) {
			System.out.println(bags[i].brand+","+bags[i].price+","+bags[i].color+","+bags[i].weight+","+bags[i].isWarranty);
		}
		
		System.out.println(" ");
		

		for(int i=bags.length/2;i<bags.length;i++) {
			System.out.println(bags[i].brand+","+bags[i].price+","+bags[i].color+","+bags[i].weight+","+bags[i].isWarranty);
		}
		
		

		System.out.println(" ");
		

		for(int i=bags.length/2;i<bags.length;i++) {
			System.out.println(bags[i].brand+","+bags[i].price+","+bags[i].color+","+bags[i].weight+","+bags[i].isWarranty);
		}
		

		System.out.println(" ");
		
		for(int i=0;i<bags.length;i++) {
			System.out.println(bags[i].brand.toUpperCase()+","+bags[i].price+","+bags[i].color+","+bags[i].weight+","+bags[i].isWarranty);
		}
		

		System.out.println(" ");
		int a=0;
		int b=0;
		for(int i=0;i<bags.length;i++) {
			System.out.println(bags[i].brand.toUpperCase()+","+bags[i].price+","+bags[i].color+","+bags[i].weight+","+bags[i].isWarranty+","+(bags[i].price+200));

			a=bags[0].price+bags[1].price+bags[2].price;
			b=a+200;
		}
		

		System.out.println(" ");
System.out.println("Total Price= "+a+" Add Price= "+b);


System.out.println(" ");
	 int c=0;
	 int d=0;
	 
for(int i=0;i<bags.length;i++) {
	c=bags[i].price*8/100;
	d=bags[i].price*9/100;
	System.out.println(bags[i].brand.toUpperCase()+","+bags[i].price+","+bags[i].color+","+bags[i].weight+","+bags[i].isWarranty+","+(bags[i].price+200)+","+(bags[i].price+c)+","+(bags[i].price-d));

}


System.out.println(" ");

 for(int i=bags[0].color.length()-1;i>=0;i--) {
System.out.println(bags[0].color.charAt(i));

}


System.out.println(" ");

String rev=" ";

 for(int i=bags[0].color.length()-1;i>=0;i--) {
	 rev=rev+bags[0].color.charAt(i);
System.out.println(rev);
 }
 

System.out.println(" ");

String rev1=" ";

 for(int i=bags[0].color.length()-1;i>=0;i--) {
	 rev1=rev1+bags[0].color.charAt(i);
 }
System.out.println(rev1);
 
 
 
}
}
