package ObjectLoopConditionDay12;

public class UseFridge {

	public static void main(String[] args) {


	Fridge f1=new Fridge();
	f1.price=50000;
	f1.brand="whirlpool";
	f1.color="Red";

	Fridge f2=new Fridge();
	f2.price=60000;
	f2.brand="samsung";
	f2.color="Black";


	Fridge f3=new Fridge();
	f3.price=40000;
	f3.brand="lg";
	f3.color="white";
	
	Fridge[] frg= {f1,f2,f3};
	
	for(int i=0;i<frg.length;i++) {
		if(frg[i].brand.contains("a") || frg[i].brand.contains("e") || frg[i].brand.contains("i") || frg[i].brand.contains("o") || frg[i].brand.contains("u"))  {
			frg[i].netprice=frg[i].price=frg[i].price+(frg[i].price*2/100);
			
			System.out.println("Brand:"+frg[i].brand+"Color:"+frg[i].color+" Netprice:"+frg[i].netprice);
		}
	
	}
	

	}
	

}
