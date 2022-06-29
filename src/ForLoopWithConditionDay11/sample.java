package ForLoopWithConditionDay11;

public class sample {
	public static void main(String[] args) {
		int num=8291;
		int a=0;
		int b=0;
		for(int i=0;i<=num;i++) {
			a=num%10;
			b=b+a;
			num=num/10;
			
		}
		System.out.println(b);
	}

}
 