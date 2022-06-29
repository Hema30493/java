package FunctionCallsDay13;

public class MaxArray {
	public int max(int a[]) {
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				
			}
		}
		return max;
	}
	public static void main(String[] args) {
		MaxArray m=new MaxArray();
		int[] ar= {10,20,5,46,27};
		System.out.println(m.max(ar));
	}

}
