import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraRunner {
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Calculadora c = new Calculadora();
		//importante las variables solamente se conocen en su bloque por defecto
		
		int x,y;
		System.out.println("Please set x value");
		try {
			x = sc1.nextInt();
		} catch(InputMismatchException e) {
			e.getStackTrace();
			System.out.println("number not introduced, by default 1");
			x=1;
		}
		System.out.println("Please set y value");
		try {
			y = sc2.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("number not introduced, by default 1");
			y = 1;
		}
		
		try {
			System.out.println("la division es " + c.dividir(x,y));
		} catch (ArithmeticException ex) {
			System.out.println("No se puede dividir por 0");
	}
  }
}
