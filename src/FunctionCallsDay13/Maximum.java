package FunctionCallsDay13;

public class Maximum {
	public String max(int a, int b, int c) {
		if(a>b || a>c) {
			return a+" is Max";
		}
		else if(b>a || b>c) {
			return  b+" is Max";
		}
		else if(c>a || c>b) {
			return c+" is Max";
			
		}
		else {
			return "Notyet";
		}
	}
	public static void main(String[] args) {
		Maximum m=new Maximum();
		System.out.println(m.max(5, 20, 10));
		
	}

}
