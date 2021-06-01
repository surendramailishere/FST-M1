package activities;

public class Car {
	String color;
	String transmission;
	int make;
	static int tyres = 4;
	static int doors = 4;
	
	public Car(String color, String transmission, int make) {
		this.color = color;
		this.transmission = transmission;
		this.make = make;
		
	}
	public void displayCharacteristics() {
		System.out.println(color);
		System.out.println(transmission);
		System.out.println(make);
		System.out.println(tyres);
		System.out.println(doors);
	}
	public void accelerate() {
		System.out.println("Car is moving forward");
	}
	public void brake() {
		System.out.println("Car has stopped");
	}
	


}
