package factorymethod;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moveable m = new CarFactory().create();
		m.go();
	}
}
