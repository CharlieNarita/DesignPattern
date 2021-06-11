package singleton;

/**
 * Eager
 * when class loading into RAM, then create a single instance for using;
 * for JVM this style is thread safe;
 * but it has a defect that is no matter the class is applied or not, always create a instance in RAM, waste the resource; 
 */
public class Mgr01 {
	private static final Mgr01 INSTANCE = new Mgr01();
	
	private Mgr01() {};
	
	public static Mgr01 getInstance() {
		return INSTANCE;
	}
	
	public static void main(String[] args) {
		Mgr01 m1 = Mgr01.getInstance();
		Mgr01 m2 = Mgr01.getInstance();
		
		System.out.println(m1 == m2);
	}
}
