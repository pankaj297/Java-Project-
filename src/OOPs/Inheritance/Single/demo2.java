package OOPs.Inheritance.Single;

class Vehicle {
	void start() {
		System.out.println("Vehicle Started...!");
	}
}

class Car extends Vehicle{
	void speed() {
		System.out.println("Car Speed 80kmph...!");
	}
}

public class demo2 {

	public static void main(String[] args) {
		// ✅ 3. Create a Vehicle class and Car class to demonstrate Inheritance.
		
		Car car = new Car();
		car.start();
		car.speed();

	}

}
