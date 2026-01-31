package Abstraction;

public abstract class Abstract {
	public static void main(String[] args) {
		 Vehicle v;
		 v = new Bike();
		 v.start();
		 v = new Car();
		 v.start();
	}
}
 abstract class Vehicle{
	abstract void start();
	void fuel() {
		System.out.println("Fuel Filled");
	}
 }
 class Bike extends Vehicle{
	 void start() {
		 System.out.println("Bike Started.......");
	 }
 }
 class Car extends Vehicle{
	 void start() {
		 System.out.println("Car Started........");
	 }
 }