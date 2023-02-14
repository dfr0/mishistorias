import java.util.Scanner;

public class TryWithResourcesRunner {

	public static void main(String[] args) {
		
		//with this try with resources you dont need to use finally or catch
		// this kind of block close the connection and close it
		// feature of java 7, implementes a class called autocloseable
		Try(Scanner scanner = new Scanner(System.in));{
			
		int[] numbers = {13, 3,4,5};
		int number = numbers[5];	
		}
		// in java 7 you cant capture some types of exceptions on the same catch block
		// catch (IOException | SQLException ex)
	}
}
