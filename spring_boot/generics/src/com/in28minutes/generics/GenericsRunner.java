package com.in28minutes.generics;

import java.util.ArrayList;
import java.util.List;

//This cannot be used for strings and integers

//public class GenericsRunner {
//				public static void main(String[] args) {
//					MyCustomList list = new MyCustomList;
//					list.addElement("Element 1");
//					list.addElement("Element 2");
//					list.addElement("Element 3");
//				
//					MyCustomList list2 = new MyCustomList;
//					list.addElement(Integer.valueOf(5));
//					list.addElement(Integer.valueOf(8));
//					list.addElement(Integer.valueOf(18));
//				}
				
//The generics aim to created a implemetation to abstract of the data type for use integers, strings or a custom class
				
				public class GenericsRunner {
					
					//the benific to use this is restricts
					static <X> X doubleValue(X value) {
						return value;
					}
					
					static <X extends List> void duplicate(X list) {
						list.addAll(list);
					}
					
					//Using wildcards
					//example to sum any of the list of number
					//creating method that return Number
					// UPPER BONE WILDCARD
					static double sumOfNumberList(List<? extends Number> numbers) { //? is a wildcard
						double sum = 0.0;
						for(Number number:numbers) {
							sum += number.doubleValue();
						}
						return sum;	
					}
					
					//LOW BONE WILDCARD
					static void addACoupleOfValues(List<? super Number> numbers) { //? is a wildcard
						numbers.add(1);
						numbers.add(1.1);
						numbers.add(1.0f);						
						numbers.add(1l);
						
					}	
					
					public static void main(String[] args) {
						
						List emptyList = new ArrayList<Number>();
						addACoupleOfValues(emptyList);
						System.out.println(emptyList);
						
						System.out.println(sumOfNumberList(List.of(1,2,3,4,5)));
						System.out.println(sumOfNumberList(List.of(1.1,2.2,3.3,4.1,5.2)));
						System.out.println(sumOfNumberList(List.of(1l,2l,3l)));
						
						String value1 = doubleValue(new String());
						Integer number1 = doubleValue(Integer.valueOf(5));
						ArrayList list1 = (new ArrayList());
						
						ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,3));
						duplicate(numbers);
						System.out.println(numbers);
					
						
					//	MyCustomList<String> list = new MyCustomList<>();
					//	
					//	list.addElement("Element 1");
					//	list.addElement("Element 2");
					//	list.addElement("Element 3");
					//	String value = list.get(0);
						
						MyCustomList<Long> list = new MyCustomList<>();
						
						list.addElement(5l);
						list.addElement(7l);
						Long value = list.get(0);		
					
						
						System.out.println(list);
					
						MyCustomList<Integer> list2 = new MyCustomList<>();
						list2.addElement(Integer.valueOf(5));
						list2.addElement(Integer.valueOf(8));
						
						//Integer number = list2.get();

						
						System.out.println(list2);
					}
					
				
}
