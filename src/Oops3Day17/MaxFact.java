package Oops3Day17;

public class MaxFact {

	public static void main(String[] args) {
		int[] a= {4,3,6,2,4};
		int max=0;
		int fact=1;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			for(int j=max;j>=1;j--) {
				
			
				fact=fact*j;
			}	
		}
		System.out.println(fact);
	
}
}