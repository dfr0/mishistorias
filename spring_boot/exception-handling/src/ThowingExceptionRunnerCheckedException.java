package checkedException;
//Check exception is anything that not is a runtime exception or a subclass of runtime exception 

	//class Amount {
		
		private String currency;
		private int amount;
		
		public Amount(String currency, int amount) {
			super();
			this.currency = currency;
			this.amount = amount;
		}
	
	public void add(Amount that) throws Exception {
		if(!this.currency.equals(that.currency)) {
		throw new Exception("Currency don´t match " + this.currency + " & " + that.currency );
	}
	  this.amount = this.amount + that.amount;
		
	}
	
	public String toString() { 
		return amount + " " + currency;
	}	
}
	
public class ThowingExceptionRunnerCheckedException {
	
	public static void main(String[] args) throws Exception {	
		Amount amount1 = new Amount("USD",10);
		Amount amount2 = new Amount("EUR",20);
		amount1.add(amount2);
		System.out.println(amount1);

	}
}
