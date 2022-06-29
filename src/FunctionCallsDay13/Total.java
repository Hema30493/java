package FunctionCallsDay13;

public class Total {
	public int total(int a) {
		int total=0;
		for(int i=0;i<=a;i++) {
			total=total+i;
		}
		return total;
	}
	public static void main(String[] args) {
		Total t=new Total();
		System.out.println(t.total(10));
	}

}
