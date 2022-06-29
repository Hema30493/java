package Exception;

public class Sample {
	public static void main(String[] args) {
		int num1=15;
		int num2=0;
		try {
		System.out.println("num1="+num1);

		System.out.println("num2="+num2);
		int num=num1/num2;

		System.out.println(num);
		} catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("It always runs");
			
		}
		System.out.println("Something");
//		String a=null;
//		try {
//		System.out.println(a.length());
//		} catch(NullPointerException n) {
//			n.printStackTrace();
//			System.out.println("Null Pointer Exception");
//		}
//		System.out.println("Something");
//		String a="567s";
//		try {
//		int b=Integer.parseInt(a);
//		
//		System.out.println(b+5);
//		} catch(NumberFormatException n) {
//			n.printStackTrace();
//		}
//		System.out.println("Something");
		
//		int[] a= {7,4,8,3,7,2};
//		try {
//		System.out.println(a[6]);
//		} catch(IndexOutOfBoundsException c) {
//			c.printStackTrace();
//			System.out.println("Outofbound Exception");
//		}
//		System.out.println("Something");
//		
//		String a="Hello";
//		try {
//		System.out.println(a.charAt(5));
//		} catch(StringIndexOutOfBoundsException c) {
//			c.printStackTrace();
//		}
//		System.out.println("Something");
		
		//Stackoverflow.method1();
	}
	

}
