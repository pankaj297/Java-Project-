package OOPs.Polymorphism;

class Animal{
	void sound() {
		System.out.println("Animal Make Sound...!");
	}
}

class Dog extends Animal{
	
//	Method Overriding
	void sound() {
		System.out.println("Dog Sound...!");
	}
}

public class demo3 {

	public static void main(String[] args) {
		// ✅ 4. Demonstrate Method Overriding using Animal class.
		
		Animal a = new Dog(); // Runtime polymorphism
		a.sound();

	}

}
