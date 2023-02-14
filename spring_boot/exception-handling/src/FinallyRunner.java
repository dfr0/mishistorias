import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		try {
			
		int[] numbers = {13, 3,4,5};
		int number = numbers[5];
		
		//System.out.println("before scanner close");
		
		// to avoid resource leak
		//scanner.close();
		
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			
			//with this statement the code is always executed
		} finally {
			if(scanner!= null) {
			System.out.println("before scanner close");
			scanner.close(); //with this sentence we ensure that scanner is closed
		  }
		}
		// if the exception has so many times can be do a memory leak, we use close to avoid it.
		System.out.println("After scanner close");
	}
}
