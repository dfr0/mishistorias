package interfaces_and_abstract_classes;

interface Flyable {
	public void fly();
}


class Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("With Wings");		
	}
		
}

class Aeroplane implements Flyable {

	@Override
	public void fly() {
		System.out.println("With fuel");		
	}
		
}

public class FlyableRunner {

	public static void main(String[] args) {
		Flyable[] flyingObjects = { new Aeroplane(), new Bird() };
		for (Flyable object :flyingObjects ) {
			object.fly();
		}
		
	}

}
