package abstractfactory;

public class Car extends AbstractVehicle {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Car is running...");
	}

	@Override
	void printName() {
		// TODO Auto-generated method stub
		System.out.println("Car");
	}

	

}
