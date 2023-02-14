package com.ifelseconditionals;

import java.util.Scanner;

public class SwitchIsWeekDay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("0 - Sunday");
			System.out.println("1 - Monday");
			System.out.println("2 - Thusday");
			System.out.println("3 - thirday");
			System.out.println("4 - weendsday");
			System.out.println("5 - friday");
			System.out.println("6 - Saturday");
			System.out.println("please select a number of the week");
			int choice = scanner.nextInt();
		
		if(choice >= 2 || choice <= 6) {
			System.out.println("You selected a week day");
		} else {
			System.out.println("You selectred a weekend day");
		}
	}

}
