package ForLoopWithConditionDay11;

public class Test {

	public static void main(String[] args) {
		int a=20;
		for(int i=0;i<=a;i++) {
			if(a%2==0 && a%3==0 && a%5==0) {
				System.out.println(i);
			}
		}
	}

}
