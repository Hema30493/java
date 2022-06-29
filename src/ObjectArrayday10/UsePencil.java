package ObjectArrayday10;

public class UsePencil {

	public static void main(String[] args) {

		Pencil p1=new Pencil();
		p1.price=5;
		p1.brand="camlin";
		p1.color="Black";
		p1.tipwidth=0.3f;
		p1.size="large";
		

		Pencil p2=new Pencil();
		p2.price=7;
		p2.brand="Absara";
		p2.color="Blue";
		p2.tipwidth=0.5f;
		p2.size="Medium";
		

		Pencil p3=new Pencil();
		p3.price=6;
		p3.brand="Natraj";
		p3.color="white";
		p3.tipwidth=0.4f;
		p3.size="small";
		
		Pencil[] pencils= {p1,p2,p3};
		/*for(int i=0;i<pencils.length;i++) {
			System.out.println(pencils[i].brand+","+pencils[i].price+","+pencils[i].color+","+pencils[i].size+","+pencils[i].tipwidth);
		}
		
		System.out.println(" ");*/
		


		for(int i=0;i<pencils.length;i++) {
			System.out.println(pencils[i].color.charAt(i));
			
		}
		//System.out.println(a);
		
		System.out.println(" ");
		
		
	}

}
