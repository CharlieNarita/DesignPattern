package observer.example07;

import java.util.ArrayList;
import java.util.List;



/**
 * general speaking, the event usually been treated depend actual case; in most
 * of cases, need event source object;
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		
		c.wakeUp();
	}

}

//fireEvent, its very important to observer pattern
class wakeUpEvent {
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
}

interface Observer {
	void actionEvent(wakeUpEvent event);
}

class Dad implements Observer {

	@Override
	public void actionEvent(wakeUpEvent event) {
		// TODO Auto-generated method stub
		System.out.print(event.toString());
		hug();
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
		feed();
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
		bark();
	}

	public void bark() {
		System.out.println("dog bark...");
	}

}