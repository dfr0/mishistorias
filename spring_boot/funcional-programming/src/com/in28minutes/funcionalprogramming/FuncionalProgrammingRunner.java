package com.in28minutes.funcionalprogramming;

import java.util.List;

public class FuncionalProgrammingRunner {

	public static void main(String[] args) {
		//Procedural programming
		List<String> list = List.of("Apple","banana", "cherry","Chocolat");
		
		//Extracted with refactor --> extract method and calle printBasic
		printWithFiltering2(list);
		
	}

	//Exercice with funcional programming
	private static void printBasic(List<String> list) {
		for(String string:list) {
			System.out.println(string);
		}
	}
	
	private static void printWithFP(List<String> list) {
		//this is not data is a action
			list.stream().forEach(
					element -> System.out.println("element " + element)); //called lambda expression, for each do a system.out tal
		
	}
	
	//Exercise with procedure programming
	private static void printBasicWithFiltering(List<String> list) {
		for(String string:list) {
			if(string.endsWith("at")) {
				System.out.println(string);
		}
	  }
	}
		
		//Same Exercise with functional programming
		private static void printWithFiltering2(List<String> list) {
			//this is not data is a action
				list.stream()
				.filter(
					     element -> element.endsWith("at") //for each apply this filter
					   )
				.forEach(  
				       element -> System.out.println("element - " + element)
				       );
		}
		//jshell execice for odd numbers
		//list.stream().filter(element -> element%2 == 0).forEach(element -> System.out.println("Show only odd numbers - " + element));
}
	

 