import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		
		SimpleInterestCalculator calculator =  new SimpleInterestCalculator ("45000.00","7.5");
		BigDecimal totalValue = calculator.calculateTotalValue(5); //5 years
		System.out.println(totalValue);
	
	}

}
