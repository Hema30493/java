package FunctionCallsDay13;

public class MinArray {

	public int minimum(int a[]) {
		int min=a[0];

		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
	}
return min;
	}
	public static void main(String[] args) {
		MinArray m=new MinArray();
		int[] ar= {35,3,56,23,67,12};
		System.out.println(m.minimum(ar));
	
}
}