package proxy.proxyexample4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 *	AOP : slice of code and depart the logical code; 
 */

interface Movable {
	public void move();
}

public class Tank implements Movable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank tank = new Tank();
		
		Movable m = (Movable)Proxy.newProxyInstance(Tank.class.getClassLoader(), 
				new Class[] {Movable.class}, 
				new LogHandler(tank)
		);
		
		m.move();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("tank is moving...");
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class LogHandler implements InvocationHandler {
	Movable m;
	
	public LogHandler(Movable m) {
		this.m = m;
	}
	
	public void before() {
		System.out.println("log: method started!");
	}
	
	public void after() {
		System.out.println("log: method ended!");
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		before();
		Object o = method.invoke(m, args);
		after();
		return o;
	}
	
}


