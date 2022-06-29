package ObjectArrayday10;

public class UseFanIndividual {

	public static void main(String[] args) {
		Fan f1=new Fan();
		f1.brand="Usha";
		f1.price=1500;
		f1.isQuality=true;
		Fan f2=new Fan();
		f2.brand="Orient";
		f2.price=1800;
		f2.isQuality=false;
		Fan[] fans=new Fan[2];
		fans[0]=f1;
		fans[1]=f2;

		for(int i=0;i<fans.length;i++) {
			System.out.println(fans[i].brand+","+fans[i].price+","+fans[i].isQuality);
		}
		
		
	}


}
