package singleton;


//singleton pattern with DCL feature
public class Mgr06 {
	
	/*	here we add volatile to INSTANCE for the purpose of avoid Order Rearrange 
	 *	that cause the reference point to a semi-initial object
	 */ 
	private static volatile Mgr06 INSTANCE;	//JIT
	
	private Mgr06() {
		
	}
	
	//this case have two null checks, so its called double check lock -- DCL
	public static Mgr06 getInstance() {
		if(INSTANCE == null) {
			synchronized (Mgr06.class) {
				//double check INSTANCE is null or not;
				if(INSTANCE == null) {
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					INSTANCE = new Mgr06();
				}
			}
		}
		
		return INSTANCE;
	}
	
	public static void main(String[] args) {
		for(int i=0; i<100; i++) {
			new Thread(()-> {
				System.out.println(Mgr06.getInstance().hashCode());
			}).start();
		}
	}

}
