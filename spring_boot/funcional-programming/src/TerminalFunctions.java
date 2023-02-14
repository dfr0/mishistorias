
public class TerminalFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Examples of terminal operations 
	
	//reduce give the output of one only value
	IntStream.range(1,11).reduce(0, (n1,n2) -> n1+n2);

	//Be carefull with null values, this is a bad practice, in java 8 was introduced Optional Value
	// we can use for example 23.isPresent 
	// this is a good example of functional interfaces, a line of code resumed six lines
	List.of(23,12,34,53).stream().max((n1,n2) -> Integer.compare(n1,n2)).get();
	
	//Min
	List.of(23,12,34,53).stream().max((n1,n2) -> Integer.compare(n1,n2)).get();
	
	//examples of filter only odds numbers (Impares)
	List.of(23,12,34,53).stream().filter(e -> e%2 == 1).forEach(e -> System.out.println(e)
		
    //examples of filter only quares numbers (Impares)
	List.of(23,12,34,53).stream().filter(e -> e%2 == 0).forEach(e -> System.out.println(e)
			
    //Put the result on a new List
    List.of(23,12,34,53).stream().filter(e -> e%2 == 1).collect(Collectors.toList())
    //The square of the firts 10 numbers. Range is excluded
	//Boxed is used to convert to a stream. 
    IntStream.range(1,11).map(e -> e * e).boxed().collect(Collectors.toList())
    
}
