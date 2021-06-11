package bridge;

public class Truck extends Vehicle {

	public Truck(Color color) {
		super(color);
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("a " + color.getColor() + " " + getName() + " is loading goods in the factory...");
	}

	@Override
	String getName() {
		// TODO Auto-generated method stub
		return "truck";
	}

}
