
public class AvoidTheNullOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//Optional was introduced on Java 8 and Avoid the null exception
	//if max is null this orElse return 0
	List.of(23,12,34,53).stream().max((n1,n2) -> Integer.compare(n1,n2)).orElse(0)

}
