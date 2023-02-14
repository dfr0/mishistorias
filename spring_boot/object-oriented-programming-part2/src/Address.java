
public class Address {
	private String line1;
	private String city;
	private String zip;
	
	//Created only the essential constructors
	public Address(String line1, String city, String zip) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zip = zip;
	}
	private String toString() {
		return line1 + " " + city + " " + zip + " ";
	}
}
