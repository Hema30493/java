package FunctionCallsDay13;

public class Vowels {
	public String vow(String a) {
		if(a.contains("a") || a.contains("e") || a.contains("i") || a.contains("0") || a.contains("u")) {
			return a+ " contains vowels";
		}
		else {
			return a+" Not contains";
		}
	}
	public static void main(String[] args) {
		Vowels v=new Vowels();
		System.out.println(v.vow("Hello"));
	}
	}


