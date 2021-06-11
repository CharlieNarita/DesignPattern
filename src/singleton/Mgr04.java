package singleton;

/**
 * lazy loading
 * though using synchronized to avoid threads problem, but it's so inefficiency;
 */
public class Mgr04 {
	private static Mgr04 INSTANCE;
	
	private Mgr04() {
		
	}
	
	public static synchronized Mgr04 getInstance() {
		if(INSTANCE == null) {
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				e.printStackTrace();
			}
			INSTANCE = new Mgr04();
		}
		return INSTANCE;
	}
	
	public static void main(String[] args) {
		for(int i=0; i<100; i++) {
			new Thread(()->{
				System.out.println(Mgr03.getInstance().hashCode());
			}).start();
		}
	}
	
}
