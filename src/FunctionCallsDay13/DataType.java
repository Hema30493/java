package FunctionCallsDay13;

public class DataType {
	public int add() {
		int a=20;
		int b=10;
		return (a+b);
		
	}
	public int sub() {
		int a=20;
		int b=10;
		return (a-b);
		
	}
	public int mul() {
		int a=20;
		int b =3;
		return (a*b);
	}
	public static void main(String[] args) {
		DataType c=new DataType();
		System.out.println(c.add());
		System.out.println(c.sub());
		System.out.println(c.mul());
	}

}
