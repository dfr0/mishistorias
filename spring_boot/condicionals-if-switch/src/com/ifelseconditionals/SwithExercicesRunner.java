package com.ifelseconditionals;

public class SwithExercicesRunner {

	public static void main(String[] args) {
		System.out.println(determineNameOfday(0));

	}
	public static String determineNameOfday(int dayNumber) { //return a complete string
		//String result = ""; //a empthy string
		switch(dayNumber) {
		//this sintax not need break statement
		case 0: return "Sunday";
		case 1: return "Monday";
		case 2: return "Tuesday";
		case 3: return "Wednesday";
		case 4: return "Thursdayday";
		case 5: return "Friday";
		case 6: return "Saturday";
		}
		//return result;
		return "Invalid day";
	}
	
	//Example of tenary operation, this is more simple to evaluate true or false
	// Only use on very simple comparings.
	//String even = (i%2 == 0 ? true: false) 
}
