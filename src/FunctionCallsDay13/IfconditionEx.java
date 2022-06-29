package FunctionCallsDay13;

public class IfconditionEx {
	public String min(int a,int b) {
		if(a<b) {
			return "a is Minimum";
			
		}
		else {
			return "b is Minimum";
		}
	}
		public static void main(String[] args) {
			IfconditionEx e=new IfconditionEx();
			System.out.println(e.min(5, 10));
		
	}

}
