package inheritance;

public class Person {
	
	private String name;
	private String email;
	private String phoneNumber;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getphoneNumber() {
		return phoneNumber;
	}
	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	//I catch this definition on Object class and i overwrite
    public String toString() {
        return getClass().getName() + "#" + Integer.toHexString(hashCode());
    }

}
