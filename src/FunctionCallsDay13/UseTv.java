package FunctionCallsDay13;

public class UseTv {


	public static void main(String[] args) {
		Tv t1=new Tv();
		Tv t2=new Tv();
		t1.price=28000;
		t1.taxAmount=1000;

		t2.price=32000;
		t2.taxAmount=800;
		System.out.println(t1.netprice(t1.price, t1.taxAmount));

		System.out.println(t2.netprice(t2.price, t2.taxAmount));
		
	}
}

