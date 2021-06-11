package decorator;

public class CarDecorator extends Decorator {

	public CarDecorator(Moveable m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	public void run() {
		super.run();
		runFast();
	}

	public void  runFast() {
		System.out.print("and its very fast...");
	}
}
