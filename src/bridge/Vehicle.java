package bridge;

public abstract class Vehicle implements Movable{
	protected Color color;
	public Vehicle(Color color) {
		this.color = color;
	}
	
	abstract String getName();
}
