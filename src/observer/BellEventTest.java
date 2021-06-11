package observer;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.EventObject;
import java.util.Iterator;
import java.util.List;

public class BellEventTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BellEventSource bell = new BellEventSource();	//bell is event source
		bell.addListener(new TeachBellEventListener());	//register listener
		bell.addListener(new StuBellEventListener());	//register listener
		
		
		bell.ring(true);
		System.out.println("------------------------");
		bell.ring(false);
		
	}

}


//event class 
class RingEvent extends EventObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean sound;	//true represent go to class ring, false represent finish class
	
	public RingEvent(Object source, boolean sound) {
		super(source);
		// TODO Auto-generated constructor stub
		this.sound = sound;
	}

	public boolean getSound() {
		return sound;
	}

	public void setSound(boolean sound) {
		this.sound = sound;
	}
}

//event source class 
class BellEventSource {
	private List<BellEventListener> listeners;
	
	public BellEventSource() {
		listeners = new ArrayList<>(); 
	}
	
	public void addListener(BellEventListener listener) {
		listeners.add(listener);
	}
	
	public void removeListener(BellEventListener listener) {
		listeners.remove(listener);
	}
	
	//concrete event ring
	public void ring(boolean sound) {
		String ringType = sound ? "Class Begin!" : "Class Over!";
		System.out.println(ringType);
		
		RingEvent event = new RingEvent(this, sound);
		notifies(event);
	}
	
	//notifies every elements in list
	protected void notifies(RingEvent e) {
		BellEventListener listener = null;
		Iterator<BellEventListener> iterator = listeners.iterator();
		while(iterator.hasNext()) {
			listener = iterator.next();
			listener.hearBell(e);
		}
	}
	
}


//observer interface
interface BellEventListener extends EventListener {
	public void hearBell(RingEvent e);
}


//teacher observer
class TeachBellEventListener implements BellEventListener {

	@Override
	public void hearBell(RingEvent e) {
		// TODO Auto-generated method stub
		if(e.getSound()) {
			System.out.println("teacher begin class...");
		} else {
			System.out.println("teacher finish class...");
		}
	}
	
}


//student observer
class StuBellEventListener implements BellEventListener {

	@Override
	public void hearBell(RingEvent e) {
		// TODO Auto-generated method stub
		if(e.getSound()) {
			System.out.println("student go to class room... prepare books");
		} else {
			System.out.println("student go out of class room... prepare back home");
		}
	}
	
}
