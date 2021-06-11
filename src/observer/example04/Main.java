package observer.example04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.wakeUp();
	}

}

class Child {
	private boolean cry = false;
	private Dad dad = new Dad();
	private Mom mom = new Mom();
	private Dog dog = new Dog();
	
	public boolean isCry() {
		return cry;
	}
	
	public void wakeUp() {
		cry = true;
		dad.hug();
		mom.feed();
		dog.bark();
	}
}

class Dad {
	public void hug() {
		System.out.println("Dad hug baby...");
	}
}

class Mom {
	public void feed() {
		System.out.println("Mom feed baby...");
	}
}

class Dog {
	public void bark() {
		System.out.println("Dog bark...");
	}
}
