import java.math.BigDecimal;

public class SimpleInterestCalculator {

	BigDecimal principal;
	BigDecimal interes;
	
	public SimpleInterestCalculator(String principal,String interes) {
		this.principal = new BigDecimal(principal);
		this.interes = new BigDecimal(interes).divide(new BigDecimal(100));
		
	}
	
//With BigDecimal cannot use + for example, you need to use add, multiply, divide etc and import the lib
	public BigDecimal calculateTotalValue(int noOfYears) {
		//Total Value = principal + principal * interest * 
		BigDecimal totalValue = principal.add(
				principal.multiply(interes)
			   .multiply(new BigDecimal(noOfYears))); //noOfYears cannot be integer
		return totalValue;
	}
	
}