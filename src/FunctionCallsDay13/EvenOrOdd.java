package FunctionCallsDay13;

public class EvenOrOdd {
	public String eve(int a) {
		if(a%2==0) {
			return a+" is Even";
		}
		else {
			return a+" is Odd";
		}
	}
public static void main(String[] args) {
	EvenOrOdd e=new EvenOrOdd();
	System.out.println(e.eve(5));
}
}
