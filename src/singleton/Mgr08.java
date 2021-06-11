package singleton;

/**
 *	it's not merely avoid threads problem, also can avoid anti-serialize;
 *	this is very perfect singleton pattern;
 */
public enum Mgr08 {
	
	INSTANCE;
	
	public static void main(String[] args) {
		for(int i=0; i<100; i++) {
			new Thread(()->{
				System.out.println(Mgr08.INSTANCE.hashCode());
			}).start();
		}

	}

}
