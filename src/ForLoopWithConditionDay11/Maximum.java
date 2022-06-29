package ForLoopWithConditionDay11;

public class Maximum {

	public static void main(String[] args) {
		int[] a= {19,3,5,70,32,11};
		int max=0;
		for(int i=0;i<a.length;i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("max");
	}


}
