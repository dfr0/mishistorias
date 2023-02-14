
public class CustomerRunner {
	
	public static void main(String[] args) {
		
		Address homeAddress = new Address("Madrid", "Calle de la paloma", "28229");
		Customer customer = new  Customer("David", homeAddress);
		
		Address workAddress = new Address("Madrid to work", "Calle de la paloma to work", "28229");
		customer.setWorkAdress(workAddress);
		
		System.out.println(customer);
	}
}
