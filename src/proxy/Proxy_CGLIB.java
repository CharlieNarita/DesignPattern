/*
package proxy;

import java.util.Random;


public class Proxy_CGLIB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperClass(Tank.class);
		enhancer.setCallback(new TimeMethodInterceptor());
		Tank tank = (Tank)enhancer.create();
		tank.move();
	}

}

class TimeMethodInterceptor implements MethodInterceptor {
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) {
	
		System.out.println(o.getClass().getSuperclass().getName());
	
		System.out.println("before");
		Object result = null;
		result = methodProxy.invokeSuper(o, objects);
		System.out.println("after");
		return result;
	}
	
}

class Tank {
	public void move() {
		System.out.print("Tank is moving...tututu...");
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

*/