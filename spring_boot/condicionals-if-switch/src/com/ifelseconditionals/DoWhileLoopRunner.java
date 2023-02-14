package com.ifelseconditionals;

import java.util.Scanner;

public class DoWhileLoopRunner {

	public static void main(String[] args) {
		
		//do while es para cuando por lo menos quieres que se ejecute el resultado una vez.
        Scanner scan = new Scanner(System.in);
        int num = -1;
        
		do {
			if(num != -1) {
				System.out.println("The Cube of the number is: " + (num * num * num));
			}
			System.out.print("Enter any number: ");
			int num= scan.nextInt();
      
		} while(num >= 0);
			System.out.print("Thanks have a fun ! ");
	}
	}
}
