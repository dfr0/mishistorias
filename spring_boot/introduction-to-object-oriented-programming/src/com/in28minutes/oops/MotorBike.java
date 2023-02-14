package com.in28minutes.oops;

public class MotorBike {
	//State is for example the velocity of the motorbike, at a specific moment
	// BAD PRACTICE DO ENCAPSULATION RULES --> int speed; --> DEFINED private
	private int speed; //Member variable belong to the objects, this inicilice to 0
	
	//Constructor, to set a value when we create a new object, same name that the class
	//Constructor is a special method that initial state of the new object.
	MotorBike(int speed){
		this.speed = speed;
	}
	
	//GOOD PRACTICE
	void setSpeed(int speed) { //Local variable	--> Only of this specific method
		if(speed > 0)
		  this.speed = speed;
		//System.out.println(speed);
		 //System.out.println(this.speed);
	}

	public int getSpeed() {
		return speed;
	}
	
	
	public void increaseSpeed(int howMuch) {
		//if(this.speed + howMuch > 0)
		//this.speed += howMuch;
		//ENCAPSULATED --> use the previous check
		setSpeed(this.speed += howMuch);
		//System.out.println(this.speed);
			}
	
	public void decreaseSpeed(int howMuch) {
		//if(this.speed - howMuch > 0)
		//this.speed -= howMuch;
		//ENCAPSULATED
		setSpeed(this.speed -= howMuch);
		//System.out.println(this.speed);
			}
	
	void start() {
		System.out.println("Bike Started");
	}
}
	
