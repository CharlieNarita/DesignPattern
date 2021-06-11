package decorator;

public class Decorator implements Moveable {
	private Moveable m;
	
	public Decorator(Moveable m) {
		this.m  = m;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		m.run();
	}

}
