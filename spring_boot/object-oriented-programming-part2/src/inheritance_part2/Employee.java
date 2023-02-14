package inheritance_part2;

import java.math.BigDecimal;

public class Employee extends Student {
	

	private String title;
	private String employer;
	private char employerGrade;
	private BigDecimal salary;
	
	public Employee(String college, String clase) {
		super(college, clase);
		this.title = title;
		
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public char getEmployerGrade() {
		return employerGrade;
	}
	public void setEmployerGrade(char employerGrade) {
		this.employerGrade = employerGrade;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}


}
