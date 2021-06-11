package observer.example08;

import java.util.ArrayList;
import java.util.List;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.wakeUp();
	}

}



abstract class Event<T> {
	abstract T getSource();
}

//fireEvent, its very important to observer pattern
class wakeUpEvent extends Event<Child>{
	@Override
	public String toString() {
		return "[timeStamp=" + timeStamp + ", location=" + location + "]";
	}

	long timeStamp;
	String location;
	//event contains source factor
	Child source;

	public wakeUpEvent(long timeStamp, String location, Child source) {
		this.timeStamp = timeStamp;
		this.location = location;
		this.source = source;
	}

	@Override
	Child getSource() {
		// TODO Auto-generated method stub
		return source;
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

		wakeUpEvent event = new wakeUpEvent(System.currentTimeMillis(), "bedroom", this);

		for (Observer ob : observers) {
			ob.actionEvent(event);
		}
	}
	
	public void stopCry() {
		cry = false;
		System.out.println("baby stop crying");
	}
}

interface Observer {
	void actionEvent(wakeUpEvent event);
}

class Dad implements Observer {

	@Override
	public void actionEvent(wakeUpEvent event) {
		// TODO Auto-generated method stub
		System.out.print(event.toString());
		if(event.getSource().isCry() == true) {
			hug();
		}
	}

	public void hug() {
		System.out.println("dad hug baby...");
	}

}

class Mom implements Observer {

	@Override
	public void actionEvent(wakeUpEvent event) {
		// TODO Auto-generated method stub
		System.out.print(event.toString());
		if(event.getSource().isCry() == true) {
			feed();
		}
		event.getSource().stopCry();
	}

	public void feed() {
		System.out.println("mom feed baby...");
	}

}

class Dog implements Observer {

	@Override
	public void actionEvent(wakeUpEvent event) {
		// TODO Auto-generated method stub
		System.out.print(event.toString());
		if(event.getSource().isCry() == true) {
			bark();
		}
	}

	public void bark() {
		System.out.println("dog bark...");
	}

}
