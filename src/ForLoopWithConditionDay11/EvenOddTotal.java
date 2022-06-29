package ForLoopWithConditionDay11;

public class EvenOddTotal {

	public static void main(String[] args) {
		int a=20;
		int total1=0;
		int total2=0;
		for(int i=0;i<=20;i++) {
			if(i%2==0) {
				total1=total1+i;
			}
			else {
				total2=total2+i;
			}
		}

		System.out.println("even total is "+total1);
	
			System.out.println("odd no total is "+total2);
			
			
		
	}

}
