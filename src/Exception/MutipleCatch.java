package Exception;

public class MutipleCatch {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		String c=null;
		String d="790g";
		int s1=Integer.parseInt(d);
		int[] f= {7,5,8,9};
		String b1="Hello";
		try {
			int num=a/b;
			System.out.println(num);
			System.out.println(c.length());
			System.out.println(s1+5);
			System.out.println(f[5]);
			System.out.println(b1.charAt(5));
		} catch(ArithmeticException e) {
			e.printStackTrace();
		} catch(NullPointerException n) {
			n.printStackTrace();
		} catch(NumberFormatException nu) {
			nu.printStackTrace();
			} 
			catch(ArrayIndexOutOfBoundsException a1) {
			a1.printStackTrace();
		} catch(StringIndexOutOfBoundsException s) {
			s.printStackTrace();
		} catch(Exception e1) {
			e1.printStackTrace();
		}
 		finally {
			System.out.println("It always run");
		}
		System.out.println("something");
	
	}

	}
