package FunctionCallsDay13;

public class Factorial {
	public void fact(int a) {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
			System.out.println(fact);
		
	}
	public static void main(String[] args) {
		Factorial f=new Factorial();
		f.fact(6);
	}

}
