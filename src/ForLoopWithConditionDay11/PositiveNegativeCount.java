package ForLoopWithConditionDay11;

public class PositiveNegativeCount {

	public static void main(String[] args) {
		int[] a= {-19,3,-5,70,-32,11,-34};
		int count1=0;
		int count2=0;
		
		for(int i=0;i<a.length;i++) {
			if (a[i]>0) {
				count1++;
				
			}
			else {
			count2++;
	}

}
		System.out.println("positive no count is "+count1);
		

		System.out.println("Negative no count is "+count2);
		
	}

}
