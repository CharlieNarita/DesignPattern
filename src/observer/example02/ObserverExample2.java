package observer.example02;

public class ObserverExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		while(!child.isCry()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("observing...");	
		}
	}

}

class Child {
	private boolean cry = false;

	public boolean isCry() {
		return cry;
	}
	
	public void wakeUp() {
		System.out.println("Waked Up! Baby is Crying: wuwuwu...");
		cry = true;
	}
}
