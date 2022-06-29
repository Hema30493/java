package FunctionCallsDay13;

public class VoterAge {
	public void age(int a) {
		if(a>=18) {
			System.out.println(a+"is Eligible");
		}
		else {
			System.out.println(a+"is not Eligible");
		}
	}
	public static void main(String[] args) {
		VoterAge v=new VoterAge();
		v.age(25);
	}

}
