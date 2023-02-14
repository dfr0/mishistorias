package interfaces_and_abstract_classes;

//Poliform, same code different behaviour

  abstract class Animal {
	abstract void bark();
  }

  class Dog extends Animal {
    	public void bark() {
	    	System.out.println("Bow Bow");
	 }
	
 }

   class Cat extends Animal {
    	public void Miau() {
	    	System.out.println("Miau Miau");
	 }
 }

public class AnimalRunner {

	public static void main(String[] args) {
		
		Animal[] animal = { new Dog(),new Cat() };
		
		for(Animal animal:animals) {
			animal.bark();
		}

	}

}
