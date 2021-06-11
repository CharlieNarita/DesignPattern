package proxy.proxyexample2;

import java.util.Random;

/**
 * Decorator like pattern;
 * the structure of proxy pattern is tend to like decorator;
 * now the proxy is very flexible;
 */

interface Movable {
	void move();
}

public class Tank implements Movable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TankMoveTimeProxy time = new TankMoveTimeProxy(new Tank());
		TankMoveLogProxy log = new TankMoveLogProxy(time);
		log.move();
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
	
	Movable mb;
	
	public TankMoveTimeProxy(Movable mb) {
		this.mb = mb;
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		mb.move();
		long end = System.currentTimeMillis();
		System.out.println("Tank moving time is: " + (end-start));
	}
	
}

class TankMoveLogProxy implements Movable {
	
	Movable mb;
	
	public TankMoveLogProxy(Movable mb) {
		this.mb = mb;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("log: tank start moving!");
		mb.move();
		System.out.println("log: tank stopped!");
	}
	
}