package bridge;

public class Car extends Vehicle {
	
	public Car(Color color) {
		super(color);
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("a " + color.getColor() + " " + getName() + " is running on the high way...");
	}

	@Override
	String getName() {
		// TODO Auto-generated method stub
		return "car";
	}

}
