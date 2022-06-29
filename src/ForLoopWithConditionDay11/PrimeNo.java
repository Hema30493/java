package ForLoopWithConditionDay11;

public class PrimeNo {


	public static void main(String[] args) {
		int a=10;
		int total1=0;
		int total2=0;
		int count1=0;
		int count2=0;
		for(int i=0;i<=20;i++) {
			if(i%2==0) {
				total1=total1+i;
				count1++;
			}

			else {
				total2=total2+i;
				count2++;
			}
		}
			System.out.println("even no average is "+total1/count1);

			System.out.println("odd no average is "+total2/count2);
	
			for (int i=0;i<=a;i++) {
				if(i==6) {
					break;
				}
				System.out.println(i);
			}
			
System.out.println(" ");

			for(int i=0;i<=a;i++) {
				if(i==6) {
					continue;
				}
				System.out.println(i);
			}
			int a1=5;
			boolean b1=true;
			for(int i=2;i<a1;i++) {
				if(a1%i==0) {
					b1=false;
				}
			}
			if(b1==true) {
				System.out.println("prime");
			}
			else {
				System.out.println("not a prime");
			}
	}

}
