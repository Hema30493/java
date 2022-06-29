package ObjectArrayday10;

public class UseTv {
	public static void main(String[] args) {
		Tv t1=new Tv();
		t1.price=80000;
		t1.brand="lg";
		t1.color="Black";
		t1.model="X1";
		
		Tv t2=new Tv();
		t2.price=70000;
		t2.brand="samsung";
		t2.color="white";
		t2.model="X12";
		
		Tv t3=new Tv();
		t3.price=60000;
		t3.brand="onida";
		t3.color="Blue";
		t3.model="X123";
		
		Tv[] tvs= {t1,t2,t3};
int dis=0;
int tax=0;
		for(int i=0;i<tvs.length;i++) {
			
			dis=tvs[i].price*7/100;
			tax=tvs[i].price*10/100;
			tvs[i].netprice=tvs[i].price-dis+tax;

			System.out.println(tvs[i].brand.toUpperCase()+","+tvs[i].color.toUpperCase()+","+tvs[i].model+","+tvs[i].netprice);
		
		}
		
		
	}

}
