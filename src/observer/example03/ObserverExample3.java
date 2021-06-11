package observer.example03;

public class ObserverExample3 {
	public static void main(String[] args) {
		Child c = new Child();
		c.wakeUp();
	}
}

class Child {
	private boolean cry = false;
	private Parent p = new Parent();
	
	public boolean isCry() {
		return cry;
	}
	
	public void wakeUp() {
		cry = true;
		System.out.println("Baby waked Up! Baby is Crying: wuwuwu...");
		p.feed(this);
	}

	public void eat() {
		System.out.println("Baby is eating...");
	}
}

class Parent {
	public void feed(Child c) {
		System.out.println("Parent is feeding baby...");
		c.eat();
	}
}
