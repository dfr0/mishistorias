package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		
		//Encapsulation is the concept that only this class should have access to the data 
		//inside the specific class. 
		//all the other classes should access data through the
		//behavior of the class, through the methods that the class offers.
		//the principle is that other classes should not be able to 
		//change the data of a specific class directly.
		//If we going to change the data of the class should be through
		//the actions, the methods that are performed through that specific class.
		ducati.start();
		honda.start();
		
		ducati.setSpeed(3);
		//System.out.println(ducati.getSpeed());
		//honda.setSpeed(80);
		//with encapsulation you can prevent bad info from methods, see MotorBike Class
		honda.setSpeed(3);
		//System.out.println(honda.getSpeed());
		//the state of the objects can change.
		//ducati.setSpeed(10);
		//honda.getSpeed();
		
		//Increment ducati speed without encapsulation, see sentence increaseSpeed
		//int ducatiSpeed = ducati.getSpeed();
		//ducatiSpeed += 100;
		//ducati.setSpeed(ducatiSpeed);
		honda.increaseSpeed(120);
		honda.decreaseSpeed(180);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());		
	}

}
