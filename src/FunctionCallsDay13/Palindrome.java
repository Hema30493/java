package FunctionCallsDay13;

public class Palindrome {
	public String pal(String a) {
		String b="";
		for(int i=a.length()-1;i>=0;i--){
			b=b+a.charAt(i);
		}
		if(a.equals(b)) {
			return "Palindrome";
		}
		else {
			return "not Palindrome";
		}
	}
public static void main(String[] args) {
	Palindrome p=new Palindrome();
	System.out.println(p.pal("wow"));
	
}}