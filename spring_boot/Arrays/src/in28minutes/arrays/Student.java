package in28minutes.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList <Integer>();
	

	public Student(String name, int... marks) { //acept variable arguments int i...
			this.name = name;
			//this.marks = marks;
			for(int mark:marks) {
				this.marks.add(mark);
			}
	}

	public int getNumberOfMarks() {
		//return marks.length;
		return marks.size(); //on ArraList the method is size not length
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for(int mark:marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximunMark() {
		//On array list using Collections
		return Collections.max(marks);
		//With Array
		//int maximun = 0;
//		int maximun = Integer.MIN_VALUE; //in this form is valid for negative
//		for(int mark:marks) {
//			if(mark > maximun) {
//				maximun = mark;
//			}
//		}
//		return maximun;
    }

	public int getMinimunMark() {
		//For ArrayList collections only add this sentence
		return Collections.min(marks);
		//For Normal Array
//		int minimun = Integer.MAX_VALUE;
//		for(int mark:marks) {
//			if(mark < minimun) {
//				minimun = mark;
//			}
//		}
//		return minimun;
 	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
		//return new BigDecimal(sum/number);
		return new BigDecimal(sum).divide(new BigDecimal(number), 3 , RoundingMode.UP); //more accuracy, 3 digits and redondeo activo
	}
	
	public String ToString() {
		return name + marks;
	}

	public void addNewMark(int mark) {
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}
}
