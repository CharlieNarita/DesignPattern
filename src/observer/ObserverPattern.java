package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * in many system, Observer pattern often handle events with Chains of Responsibility pattern together;
 * sometimes observer charge event spread steps, it can stop the reaction of chains;
 */

public class ObserverPattern {
	public static void main(String[] args) {
		Subject s = new ConcreteSubject();
		Observer o1 = new ConcreteObserver1();
		Observer o2 = new ConcreteObserver2();
		
		s.add(o1);	
		s.add(o2);
		
		s.notifyObserver();
	}
}

abstract class Subject {
	protected List<Observer> observers = new ArrayList<>();
	
	public void add(Observer observer) {
		observers.add(observer);
	}
	
	public void remove(Observer observer) {
		observers.remove(observer);
	}
	
	public abstract void notifyObserver();
}

class ConcreteSubject extends Subject{
	
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		System.out.println("when something happened...");
		System.out.println("--------------------------");
		
		for(Observer ob : observers) {
			ob.response();
		}
	}
	
}

interface Observer {
	void response();
}


class ConcreteObserver1 implements Observer{

	@Override
	public void response() {
		// TODO Auto-generated method stub
		System.out.println("cob1 response...");
	}
	
}

class ConcreteObserver2 implements Observer {

	@Override
	public void response() {
		// TODO Auto-generated method stub
		System.out.println("cob2 response...");
	}
	
}