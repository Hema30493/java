package ObjectLoopConditionDay12;

public class UseAc {
	
		public static void main(String[] args) {
		Ac a1=new Ac();
		a1.price=50000;
		a1.brand="whirlpool";
		a1.model="XI";
		

		Ac a2=new Ac();
		a2.price=40000;
		a2.brand="samsung";
		a2.model="XII";
		

		Ac a3=new Ac();
		a3.price=30000;
		a3.brand="onida";
		a3.model="XII";
		
		Ac[] acs= {a1,a2,a3};

		for(int i=0;i<acs.length;i++) {
			if(acs[i].price<40000) {
				acs[i].price=acs[i].price+(acs[i].price*2/100);
				
			}

			System.out.println("Brand: "+acs[i].brand+" Model: "+acs[i].model+" Warranty "+" price:"+acs[i].price);
				}
		}

}
