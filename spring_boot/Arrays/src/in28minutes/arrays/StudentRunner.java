package in28minutes.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		
		//int marks[] = {67,45,98,45,66};
		Student student = new Student("david", 97 , 98, 92);
		//Student student = new Student ("David", new int[] = { 45, 56, 67, 78, 89} );
		//best form
		//Student student = new Student ("lalala", new int[] = {45,56,67,78,89});
		//Student student1 = new Student ("lalala", new int[] = {45,56,67,78,89});
		
		int number= student.getNumberOfMarks();
		System.out.println("number of marks "+ number);
		int sum = student.getTotalSumOfMarks();
		System.out.println("the sum of marks "+ sum);
		int maximumMark = student.getMaximunMark();
		System.out.println("the mark maximun is "+ maximumMark);
		int minimumMark = student.getMinimunMark();
		System.out.println("the mark minimun is "+ minimumMark);
		BigDecimal average = student.getAverageMarks();
		System.out.println("the average is "+ average);
		
		System.out.println(student);
		
		student.addNewMark(35);
		
		System.out.println(student);
		
		student.removeMarkAtIndex(1);
		
		System.out.println(student);
		
	}

}
