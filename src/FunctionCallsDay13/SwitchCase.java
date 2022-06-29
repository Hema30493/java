package FunctionCallsDay13;

public class SwitchCase {
	public void swi(String a) {
		switch (a) {
		case "Usa":
			System.out.println("Washington");
			break;
		case "Japan":
			System.out.println("Tokyo");
			break;
		case "China":
			System.out.println("Beijing");
			break;
		case "Southkorea":
			System.out.println("soeue");
			break;
		case "India":
			System.out.println("Delhi");
			break;
		case "Uk":
			System.out.println("London");
			break;
		}
	}
	public static void main(String[] args) {
		SwitchCase s=new SwitchCase();
		s.swi("India");
	}
}