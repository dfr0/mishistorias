
public class ExceptionHandlingRunner {

	//if the exception it is not handler, the method is not executed
	// the exception go up the call chain
	
	public static void main(String[] args) {
		method1();

	}

	private static void method1() {
		method3();
	}

	private static void method3() {
		String str = null;
		str.length();
	}

}
