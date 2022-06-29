package ObjectLoopConditionDay12;

public class UseMarker {

	public static void main(String[] args) {
		Marker m1=new Marker();
		m1.brand="camlin";
		m1.price=50;
		m1.color="Black";

		Marker m2=new Marker();
		m2.brand="Renolds";
		m2.price=30;
		m2.color="Blue";
		Marker[] markers= {m1,m2};
		int a1=0;
		for(int i=0;i<markers.length;i++) {
			if(m1.price>m2.price) {
				a1=a1+m1.price;
			}
		}
				System.out.println(m1.price+"is high");
			
			
		}

}
