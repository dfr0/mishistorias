
public class ExceptionHandlingRunner2 {

	//if the exception it is not handler, the method is not executed
	// the exception go up the call chain
	
	public static void main(String[] args) {
		method1();

	}

	private static void method1() {
		method3();
	}
	
	//if controlled the exception it will be hide to the upper method that call the method

	//when exception happen we try to show all stack
	private static void method3() { 
		try { //with try catch the chain is not upper to another methods
		//String str = null;
		//str.length();
		int[] i = {1,2};
		int number = i[3];
		//depend of the kind of the exception the specific thing will be happen.
		// in this case is a array exception
	} catch (NullPointerException ex) { //each exception has their own priority and type
		ex.printStackTrace(); 
	} catch (ArrayIndexOutOfBoundsException ex) { //each exception has their own priority and type
		ex.printStackTrace(); //if not put anything the exception is gobblen up, no message
	} catch (Exception ex) { //I put a nullPoinrtException as well
		ex.printStackTrace(); 
	}
  }
}
