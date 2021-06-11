package proxy.proxyexample3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 *	Dynamic proxy depend java reflection mechanism;
 *	Dynamic proxy can agent any type of classes;
 * 	The dynamic proxy mechanism can get class's attributes and methods through binary code with out actual class instance;
 * 	
 *	in this case, if you want LogProxy can proxy any type of class and repeat to use, for that use JDK dynamic proxy instead of static proxy;
 *	its depart the proxy behave and object;
 *	
 *	Essentially in bottom level, there are ASM and Instrument;
 *	ASM is a frame work can modify bin-code directly;
 *	Instrument is similar with ASM but greater than ASM;
 */

interface Movable {
	 public void move();
 }

public class Tank implements Movable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank tank = new Tank();
		
		//java reflection, it can get class's attributes and methods through binary code with out actual class instance;
		/**
		 * public static Object newProxyInstance(ClassLoader loader,
         *                                 Class<?>[] interfaces,
         *                                 InvocationHandler h)
         * 
         * @param	loader : the class loader to define the proxy class;
         * @param   interfaces : the list of interfaces for the proxy class to implement;
         * @param   h : the invocation handler to dispatch method invocations to;
		 */
		//Proxy.newProxyInstance() must return a concrete proxy object;
		Movable m = (Movable)Proxy.newProxyInstance(Tank.class.getClassLoader(), //first parameter is class loader usually same as target class;
				new Class[] {Movable.class},	//second parameter a class type array means the object will be returned must implements interfaces; 
				new LogHandler(tank)	//third parameter is concrete object which implements InvocationHandler;
		); 
		
		m.move();
	
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Tank is moving...tututu...");
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

//a class implements InvocationHandler is purpose for treating target object;
class LogHandler implements InvocationHandler {

	Tank tank;
	
	public LogHandler(Tank tank) {
		this.tank = tank;
	}
	
	//getClass.getMethods[]-----> return a methods array
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("method " + method.getName() + " started!");
		Object o = method.invoke(tank, args);
		System.out.println("method " + method.getName() + " end!");
		return o;
	}
	
}