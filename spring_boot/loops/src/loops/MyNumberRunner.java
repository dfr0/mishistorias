package loops;

public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(9);
		
		boolean isPrime = number.isPrime();
		System.out.println("is Prime " + isPrime);
		
		//another exercice
		int sum = number.sumUpToN();
		System.out.println("sumUpToN " + sum);
			
		//another exercice
		int sumOfDivisors = number.sumOfDivisors();
		System.out.println("sumOfDivisors " + sumOfDivisors);
		
		//another exercice
		number.printNumberTriangle();
		
		
	}
	
}
