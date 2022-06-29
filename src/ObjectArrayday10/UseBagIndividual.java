package ObjectArrayday10;

public class UseBagIndividual {

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
		b3.weight=2.5f;
		b3.isWarranty=true;
		Bag[] bags=new Bag[3];
		bags[0]=b1;
		bags[1]=b2;
		bags[2]=b3;
		for(int i=0;i<bags.length;i++) {
			System.out.println(bags[i].brand+","+bags[i].price+","+bags[i].color+","+bags[i].weight+","+bags[i].isWarranty);
		}
		

}
}
