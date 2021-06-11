package factorymethod;

public class PlaneFactory {
	public Moveable create() {
		System.out.println("a plane is created");
		return new Plane();
	}
}
