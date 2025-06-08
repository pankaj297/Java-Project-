package OOPs.Abstract;

//Abstract class 
//An abstract class must be declared with an abstract keyword.
abstract class Animal{
	abstract void walk();
	
	//constractor - It can have constructors
	Animal(){
		System.out.println("You are creating a new Animal..!");
	}
	
	//It can have abstract and non-abstract methods.
	public void eat() {
		System.out.println("Animal Eat...!");
	}
}

class Horse extends Animal{
	//constractor - It can have constructors
	Horse(){
		System.out.println("Created a Horse..!");
	}
	public void walk() {
		System.out.println("Walks with 4 legs");
	}
	
}

class Chicken extends Animal{
	public void walk() {
		System.out.println("Walk with 2 legs");
	}
}

public class demo1 {

	public static void main(String[] args) {
		// Abstract

		Horse horse = new Horse();
		horse.walk();
		horse.eat();
		
		
//		1. Abstract Class
//		● An abstract class must be declared with an abstract keyword.
//		● It can have abstract and non-abstract methods.
//		● It cannot be instantiated. - we are not create object of abstract class
//		● It can have constructors and static methods also.
//		● It can have final methods which will force the subclass not to change the body of
//		the method.

	}

}
