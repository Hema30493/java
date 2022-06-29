package Exception;

public class Stackoverflow {
	public static void method1() {
		method2();
	}
	public static void method2() {
		method1();
	}

}
