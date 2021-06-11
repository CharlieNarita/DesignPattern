package observer.example05;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.wakeUp();
	}

}

class Child {
	private boolean cry = false;
	private List<Observer> observers = new ArrayList<>();
	
	{
		observers.add(new Dad());
		observers.add(new Mom());
		observers.add(new Dog());
	}
	
	public boolean isCry() {
		return cry;
	}
	public void wakeUp() {
		cry = true;
		for(Observer ob : observers) {
			ob.actionWakeUp();
		}
	}
}


interface Observer {
	void actionWakeUp();
}

class Dad implements Observer {

	@Override
	public void actionWakeUp() {
		// TODO Auto-generated method stub
		hug();
	}
	
	public void hug() {
		System.out.println("dad hug baby...");
	}
	
}

class Mom implements Observer {

	@Override
	public void actionWakeUp() {
		// TODO Auto-generated method stub
		feed();
	}
	
	public void feed() {
		System.out.println("mom feed baby...");
	}
}

class Dog implements Observer {

	@Override
	public void actionWakeUp() {
		// TODO Auto-generated method stub
		bark();
	}
	
	public void bark() {
		System.out.println("dog bark...");
	}
	
}