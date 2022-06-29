package FunctionCallsDay13;

public class VoidExample {
	public void add() {
		int a=10;
		int b=40;
		System.out.println(a+b);
	}
	public void sub() {
		int a=20;
		int b=10;
		System.out.println(a-b);
	}
	public void mul() {
		int a=10;
		int b=2;
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		VoidExample c=new VoidExample();
		c.add();
		c.sub();
		c.mul();
	}

}
