package com.in28minutes.oops;

public class BookRunner {
	

	public static void main(String[] args) {
			Book espadaDeJoran1 = new Book(1000);
			Book espadaDeJoran2 = new Book(1000);
			Book espadaDeJoran3 = new Book(1000);
			
			espadaDeJoran1.setNumberOfCopies(3);
			espadaDeJoran2.setNumberOfCopies(5);
			espadaDeJoran3.setNumberOfCopies(8);
			
			espadaDeJoran1.increaseCopies(100);
			espadaDeJoran1.decreaseCopies(200);
			
			System.out.println(espadaDeJoran1.getNumberOfCopies());
			
			
	}
}
