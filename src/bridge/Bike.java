package bridge;

public class Bike extends Vehicle {

	public Bike(Color color) {
		super(color);
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("a " + color.getColor() + " " + getName() + " is riding in the school");
	}

	@Override
	String getName() {
		// TODO Auto-generated method stub
		return "bike";
	}

}
