import java.util.List;

public class MethodReferencesRunner {
	
	public static void print(Integer number) {
		System.out.println(number);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method references are more redeable

	List.of("Cat","Dog","Elephan").stream()
	.map(s -> s.length())
	//.forEach(s -> System.out.println(s));
	//A shortcut for this System.out is
	.forEach(System.out::println);
	
	//Example using method 
	List.of("Patata","Cancer","Silicona").stream()
	 .map(String::length) //another shortcut
	 //.forEach(s -> System.out.println(s));
	//A shortcut for this System.out is
	 .forEach(MethodReferencesRunner::print);
	}

}
