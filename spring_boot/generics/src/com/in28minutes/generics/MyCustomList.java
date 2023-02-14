package com.in28minutes.generics;

import java.util.ArrayList;

//the capital letter here, for example T is added the option to set a Type, o i can put TYPE or E, but we prefer T is descriptive

// public class MyCustomList<T> { 
	//you can extens to restrinct the types but the advange is used all custom method of numbers on this class
	public class MyCustomList<T extends Number> { 
	
			ArrayList<T> list = new ArrayList<>();
			
			public void addElement(T element) {
				list.add(element);
			}
			
			public void removeElement(T element) {
				list.remove(element);
			}
				
				public String toString() {
					return list.toString();
				}

				public T get(int index) {  //T becase you used a Type with <>
					return list.get(index);
				}
}
