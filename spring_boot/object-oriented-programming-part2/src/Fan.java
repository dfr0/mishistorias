
public class Fan {
	//1- State 
	private String make;
	private double radius;
	private String color;
	//Not so important to create a constructor
	private boolean isOn;
	private byte speed; //1 to 5 
	
	//2- Creation of constructor, inicialization of the values. Thinking on the most important 
	public Fan(String make, double radius, String color) { //mandatory field when create and object
		this.make = make;
		this.radius = radius;
		this.color = color;
	}
	
	//isON, think always on the perspective of the API consumer
	public void switchOn() {
		this.isOn = true;
		setSpeed((byte)5);
	}
	
	public void switchOff() {
		this.isOn = false;
		setSpeed((byte)0);
	}
	
	//speed
	public void setSpeed(byte speed) {
		this.speed = speed;
	}
	
	//Print the state
	public String toString() {
		return String.format("Manufacture - %s, radius - %f, color - %s, isOn - %b, speed - %s" , make, radius, color, isOn ,speed);
	}
}
