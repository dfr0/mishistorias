
public class Customer {
		//State
		private String name;
		private Address homeAddress; //address here is a object composition, a object class with call to another object class 
		private Address workAddress; //address here is a object composition, a object class with call to another object class
		
		
		//Creating constructor, only the must
		public Customer(String name, Address homeAddress) {
			this.name = name;
			this.homeAddress = homeAddress;
		}

		//Operations
		public Address getHomeAdress() {
			return homeAddress;
		}


		public void setHomeAdress(Address homeAdress) {
			this.homeAddress = homeAdress;
		}


		public Address getWorkAdress() {
			return workAddress;
		}


		public void setWorkAdress(Address workAdress) {
			this.workAddress = workAdress;
		}
		
		public String toSting() {
			return String.format("name %s - home address %s - work address %s ", name, homeAddress,workAddress );
			
		}
		
}
