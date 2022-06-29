package FunctionCallsDay13;

public class Prime {
	public void pri(int a) {
		boolean b=true;
		for(int i=2;i<a;i++) {
			if(a%2==0) {
				b=false;
			}
		}
		if(b==true) {
			System.out.println(a+" is prime no");
		
		}
		else {
			System.out.println(a+" is not prime no");
		
		}
	}
public static void main(String[] args) {
	Prime p=new Prime();
	p.pri(11);
}
}
