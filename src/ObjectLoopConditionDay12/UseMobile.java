package ObjectLoopConditionDay12;

public class UseMobile {


	public static void main(String[] args) {

	Mobile m1=new Mobile();
	m1.price=20000;
	m1.brand="Apple";
	m1.color="white";
	m1.isWarranty=true;
	
	Mobile m2=new Mobile();
	m2.price=15000;
	m2.brand="vivo";
	m2.color="silver";
	m2.isWarranty=true;
	
	Mobile m3=new Mobile();
	m3.price=13000;
	m3.brand="Oppo";
	m3.color="Black";
	m3.isWarranty=false;
	
	Mobile[] mobs= {m1,m2,m3};
	

		for(int i=0;i<mobs.length;i++) {
			if(mobs[i].price>15000) {
				mobs[i].price=mobs[i].price-(mobs[i].price*3/100);
				
			}
		
	System.out.println("Brand: "+mobs[i].brand+" color: "+mobs[i].color+" Warranty "+mobs[i].isWarranty+" price:"+mobs[i].price);
		}
}

}
