package Exception;

public class Test {
	public static void main(String[] args) {
//		int a=10;
//		int b=0;
//		try {
//			int num=a/b;
//			System.out.println(num);
//		} catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("It always run");
//		}
//		System.out.println("something");
//	
		int a=10;
		int b=0;
		try {
			int num=a/b;
			System.out.println(num);
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("It always run");
		}
		System.out.println("something");
	
		
	}

}
