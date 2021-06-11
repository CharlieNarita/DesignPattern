package proxy.proxyexample5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

interface Movable {
	public void move();
}

public class Tank implements Movable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank tank = new Tank();
		
		//this step will generate a class like $Proxy0;
		System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
		/**
		 *	final class $Proxy0 extends Proxy implements Movable {
			    private static Method m0;
			    private static Method m1;
			    private static Method m2;
			    private static Method m3;
			
			    public $Proxy0(InvocationHandler param1) {	
			        super(var1);
			    }
			
				......
			
			    public final void move() {
			        try {
			            super.h.invoke(this, m3, (Object[])null);
			        } catch (RuntimeException | Error var2) {
			            throw var2;
			        } catch (Throwable var3) {
			            throw new UndeclaredThrowableException(var3);
			        }
			    }
			
			
			    static {
			        try {
			            m0 = Class.forName("java.lang.Object").getMethod("hashCode");
			            m1 = Class.forName("java.lang.Object").getMethod("equals", Class.forName("java.lang.Object"));
			            m2 = Class.forName("java.lang.Object").getMethod("toString");
			            m3 = Class.forName("proxy.proxyexample5.Moveable").getMethod("move");
			        } catch (NoSuchMethodException var2) {
			            throw new NoSuchMethodError(var2.getMessage());
			        } catch (ClassNotFoundException var3) {
			            throw new NoClassDefFoundError(var3.getMessage());
			        }
			    }
			}
		 */
		// Movable m actually is $Proxy0 object;
		Movable m = (Movable)Proxy.newProxyInstance(Tank.class.getClassLoader(), 
				new Class[] {Movable.class}, 
				new LogHandler(tank)
		);
				
		m.move();	//when m call move() method, there also has LogHandler call the invoke() method together;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("tank is moving...tututu...");
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
	
	//getClass.getMethods[]-----> return a methods array
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("method " + method.getName() + " started!");
		Object o = method.invoke(m, args);
		System.out.println("method " + method.getName() + " end!");
		return o;
	}
	
	
}