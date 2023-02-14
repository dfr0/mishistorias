package com.ifelseconditionals;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		//Type obj = new Type(argument);
		Scanner scanner = new Scanner(System.in); //Scanner is a java class to user input
		System.out.println("Enter number1: ");
		int number1 = scanner.nextInt();
		System.out.println("Enter number2: ");
		int number2 = scanner.nextInt();
		
		System.out.println("Enter Available are ");
		System.out.println("1- add");
		System.out.println("2- subtract ");
		System.out.println("3- divide ");
		System.out.println("4- multiply ");
		
		System.out.println("Enter Available are ");
		
		System.out.println("Enter Choice: ");
		int choice = scanner.nextInt();
		
		System.out.println("Your Choice are ");
		System.out.println("Number1 " + number1);
		System.out.println("Number2 " + number2);
		System.out.println("Choice " + choice);
		
		//Ugly style
		performOperationUsingSwitch(number1, number2, choice);
		//improve menu with switch
	}

	/*private static void performOperationUsingSwitchIfElse(int number1, int number2, int choice) {
		if(choice == 1) {
			System.out.println("Result " + (number1 + number2));
		}else if (choice == 2){ 
			System.out.println("Result " + (number1 - number2));	
		}else if (choice == 3){
			System.out.println("Result " + (number1/number2));	
	    }else if (choice == 4){
	    	System.out.println("Result " + (number1 * number2));	
	    }else {
	    	System.out.println("Operation denied");
		}
	}
	*/
	//Improve menu with switch
	private static void performOperationUsingSwitch(int number1, int number2, int choice) {
		switch(choice) {
		case 1: System.out.println("Result " + (number1 + number2)); break; //if not put break this ejecute all
		case 2: System.out.println("Result " + (number1 - number2)); break; //if not put break this ejecute all
		case 3: System.out.println("Result " + (number1 / number2)); break; //if not put break this ejecute all
		case 4: System.out.println("Result " + (number1 * number2)); break; //if not put break this ejecute all
		default: System.out.println("Operation denied"); break; //if not put break this ejecute all
		}
	}
}
