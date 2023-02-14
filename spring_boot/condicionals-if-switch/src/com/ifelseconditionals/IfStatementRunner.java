package com.ifelseconditionals;

public class IfStatementRunner {
	
	public static void main(String[] args) {
		
	//puzzle1();
	puzzle2();
	}
	
	private static void puzzle1() {
			int i = 24;
			//Nested conditions
			if(i == 25) {
				System.out.println("i == 25");
			} else if(i == 24) {
					System.out.println("i == 24");
			} else if(i == 24) {
				System.out.println("i == 26");
			} else {
				System.out.println("i != 24 or 25 or 26");
			}

 }
	private static void puzzle2() {
			int m = 21;
			if(m >20) {
				if(m<20) {
					System.out.print("m is less than 20");
				} else {
					System.out.print("m is not less than 20");
				}
		}
	}
}