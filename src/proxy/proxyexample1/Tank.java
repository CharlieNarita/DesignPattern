package proxy.proxyexample1;

import java.util.Random;

interface Movable {
	void move();
}

public class Tank implements Movable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TankMoveTimeProxy proxy = new TankMoveTimeProxy(new Tank());
		proxy.move();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Tank is moving...tutututu...");
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

class TankMoveTimeProxy implements Movable {
	Tank tank;
	
	public TankMoveTimeProxy(Tank tank) {
		this.tank = tank;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		tank.move();
		long end = System.currentTimeMillis();
		System.out.println("Tank moving time is: " + (end-start));
	}
	
}

