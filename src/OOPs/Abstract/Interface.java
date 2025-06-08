package OOPs.Abstract;

interface HoseAnimal{
	void walk();

	//int interface non abstract function are not allowed
//	void eat() {
//		
//	}
	
	//interface not constructor
//	Animal(){
//		🚫
//	}
	
	
}

interface Herbivore {
	
}

// example of multiple inheritance using iterface

class Dog implements HoseAnimal, Herbivore{
	public void walk() {
		System.out.println("Walks with 4 legs..!");
	}
}

public class Interface {

	public static void main(String[] args) {
		// Interface Example
		
		Dog dog = new Dog();
		dog.walk();
		
		
		
//		2. Interfaces
//		● All the fields in interfaces are public, static and final by default.
//		● All methods are public & abstract by default.
//		● A class that implements an interface must implement all the methods declared
//		in the interface.
//		● Interfaces support the functionality of multiple inheritance.
 
	}

}
