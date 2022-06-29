package ObjectLoopConditionDay12;

public class UseBottle {

	public static void main(String[] args) {


		Bottle b1=new Bottle();
		b1.price=500;
		b1.brand="XI";
		b1.color="Red";
		b1.isPlastic=true;


		Bottle b2=new Bottle();
		b2.price=400;
		b2.brand="XII";
		b2.color="Pink";
		b2.isPlastic=false;
		

		Bottle b3=new Bottle();
		b3.price=300;
		b3.brand="XIII";
		b3.color="Red";
		b3.isPlastic=true;
		

		Bottle b4=new Bottle();
		b4.price=350;
		b4.brand="X";
		b4.color="Pink";
		b4.isPlastic=false;
		Bottle[] botls= {b1,b2,b3,b4};
		

		for(int i=0;i<botls.length;i++) {
			if(botls[i].color.equalsIgnoreCase("red")) {
				System.out.println("brand "+botls[i].brand+" Color "+botls[i].color);
			}
		}
	

}

}
