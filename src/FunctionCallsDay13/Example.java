package FunctionCallsDay13;

public class Example {
	public int add(int a,int b) {
		return a+b;
	}
	public void show(String a) {
		System.out.println(a);
		
	}
	public String getName() {
		return "Onesoft";
	}
	public float mul(int a,int b) {
		return a*b;
	}
	public static void main(String[] args) {
		Example e=new Example();
		System.out.println(e.add(10,12));
		e.show("Hello");
				System.out.println(e.getName());
				System.out.println(e.mul(20,3));
	}

}
