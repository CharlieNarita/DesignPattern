package bridge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car(new Red());
		c.move();
		
		Car c2 = new Car(new Blue());
		c2.move();
		
		Truck t = new Truck(new Yellow());
		t.move();
		
		Truck t2 = new Truck(new Green());
		t2.move();
		
		System.out.println("--------------------------------");
		
		Color red = new Red();
		Color blue = new Blue();
		Color yellow = new Yellow();
		Color green = new Green();
		
		Bike b1 = new Bike(red);
		Bike b2 = new Bike(blue);
		Bike b3 = new Bike(yellow);
		Bike b4 = new Bike(green);
		
		b1.move();
		b2.move();
		b3.move();
		b4.move();
	}

}
