package factorymethod;

public class CarFactory {
	public Moveable create() {
		System.out.println("a car is created");
		return new Car();
	}
}
