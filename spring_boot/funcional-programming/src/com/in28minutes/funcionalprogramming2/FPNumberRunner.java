package com.in28minutes.funcionalprogramming2;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		List <Integer> numbers = List.of(3,6,8,13,4,2,3,1);
		//numbers.stream().forEach(element -> System.out.println(element));
	
	//ahora queremos reducir todos los elementos a un elemento, procesamos cada par hasta el último
    //starting with 0
	//lamda expression is a shot method like this
  // en la programacion funcional nos centramos en decir que tiene que hacer y evitamos mutaciones
	//int sum = numbers.stream().reduce(
	//		0, 
	//		//with two parameters needed a parentesis.
	//		(number1, number2) -> number1 + number2   //function, for every pair of numbers do sum in this case
	//		);
		
	//Method extracted of old way
	//int sum = normalSum(numbers);
	
	//System.out.println(sum);
	//}

//	private static int normalSum(List<Integer> numbers) {
//		int sum = 0;
//		for(int number:numbers) {
//			sum += number;
//		}
//		return sum;
//	}

		int sum = fpSum(numbers);
		
		//Stream is a source of objects
		// the boyd is all between {} inside the stream.
		// The two big opetations with streams (filter is a intermediate operation, sort, list), also intermediate operation always the output is 
		// another stream operation, and terminal operations if a zoom of operation for example forEach or reduce
		
		//another example 
		private static int fpSum(List<Integer> numbers) {
			return numbers.stream().reduce(0,
					(number1, number2) -> { 
						System.out.println(number1 + " " + number2);
						return number1 + number2;  //function, for every pair of numbers do sum in this case
					});
		}
		
		//super example on Jshell
		//numbers.stream().distinct().map(e-> e*e).sorted().forEach(e->System.out.println(e));
	}

