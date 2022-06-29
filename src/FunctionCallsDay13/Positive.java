package FunctionCallsDay13;

public class Positive {
	public void pos(int a) {
		if(a>0) {
			System.out.println(a+ "is Positive");
		}
		else if (a<0) {
			System.out.println(a+ "is Negative");
		}
		else {
			System.out.println(a+ " is zero");
		}
	}
public static void main(String[] args) {
	Positive p=new Positive();
	p.pos(-20);
}
}

