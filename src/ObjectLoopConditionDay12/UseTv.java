package ObjectLoopConditionDay12;

public class UseTv {

	public static void main(String[] args) {
		Tv t1=new Tv();
		t1.price=80000;
		t1.brand="samsung";
		t1.color="white";
		t1.inch=38;
		
		Tv t2=new Tv();
		t2.price=50000;
		t2.brand="redmi";
		t2.color="grey";
		t2.inch=36;
		

		Tv t3=new Tv();
		t3.price=40000;
		t3.brand="Tcl";
		t3.color="blue";
		t3.inch=32;
		

		Tv t4=new Tv();
		t4.price=45000;
		t4.brand="realme";
		t4.color="black";
		t4.inch=36;
		Tv[] tvs= {t1,t2,t3,t4};
		for(int i=0;i<tvs.length;i++) {
			if(tvs[i].price>50000) {

				tvs[i].netprice=tvs[i].price+(tvs[i].price*15/100)-(tvs[i].price*10/100);
				
			}
			else {
				tvs[i].netprice=tvs[i].price+(tvs[i].price*10/100)-(tvs[i].price*5/100);
			}
				System.out.println("Brand: "+tvs[i].brand+" color: "+tvs[i].color+"inch: "+tvs[i].inch+" price:"+tvs[i].price+" Netprice:"+tvs[i].netprice);
			
			}
	}

}
