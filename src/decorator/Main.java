package decorator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moveable m = new Car();
		m.run();
		
		System.out.println();
		
		Moveable m2 = new CarDecorator(m);
		m2.run();
	}

}
