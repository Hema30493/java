package ForLoopWithConditionDay11;

public class OddTotal {


	public static void main(String[] args) {
		int a=20;
		int total=0;
		for(int i=0;i<=20;i++) {
			if(i%2!=0) {
				total=total+i;
			}
		}
			System.out.println("odd no total is "+total);
			
	}
		

}
