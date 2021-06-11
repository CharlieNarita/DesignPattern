package memento;

public class MementoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orignator o = new Orignator();
		Caretaker c = new Caretaker();
		
		o.setState("S1");
		System.out.println("initial state: " + o.getState());
		
		c.setMemento(o.createMemento());	//save the initial sate
		
		o.setState("S2");
		System.out.println("new state: " + o.getState());
		
		o.restoreMemento(c.getMemento());	//restore the state 
		
		System.out.println("restored state: " + o.getState());
	}

}

class Memento {
	private String state;
	
	public Memento(String state) {
		this.state = state;
	}
	
	public void setSate(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
}

class Orignator {
	private String state;
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
	public Memento createMemento() {
		return new Memento(state);
	}
	
	public void restoreMemento(Memento m) {
		this.setState(m.getState());
	}
}

//memento manager 
class Caretaker {
	private Memento memento;
	
	public void setMemento(Memento m) {
		memento = m;
	}
	
	public Memento getMemento() {
		return memento;
	}
	
}
