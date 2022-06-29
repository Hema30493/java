package FunctionCallsDay13;

public class SquareAndCube {
	public int square(int a) {
		return a*a;
		
	}
	public void cube(int a) {
		System.out.println(a*a*a);
	}
	public static void main(String[] args) {
		SquareAndCube c=new SquareAndCube();
		System.out.println(c.square(5));
		c.cube(3);
	}

}
