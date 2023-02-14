package com.in28minutes.oops;

public class Book {
	
	public int numberOfCopies; //This inicializate on 0
	
	//Constructor, to set a value when we create a new object, same name that the class
	Book(int numberOfCopies){
		this.numberOfCopies = numberOfCopies;
	}
	
	public void setNumberOfCopies(int numberOfCopies) {
		if(numberOfCopies>0);
	    this.numberOfCopies = numberOfCopies;
	}
    public int getNumberOfCopies() {
		  return this.numberOfCopies;		
	}
	
	public void increaseCopies(int howMuch) {
		setNumberOfCopies(this.numberOfCopies += howMuch);
		
	}
	public void decreaseCopies(int howMuch) {
		setNumberOfCopies(this.numberOfCopies -= howMuch);
		
	}
}
