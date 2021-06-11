package observer.example09;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btn = new Button();
		btn.addActionListener(new MyActionListener());
		btn.buttonPressed();
	}
	
}

class Button {
	private List<ActionListener> actionListeners = new ArrayList<>();
	
	public void buttonPressed() {
		ActionEvent e = new ActionEvent(System.currentTimeMillis(), this);
		
		for(ActionListener al : actionListeners) {
			al.actionPerformed(e);
		}
	}
	
	public void addActionListener(ActionListener al) {
		actionListeners.add(al);
	}
}

interface ActionListener {
	public void actionPerformed(ActionEvent e);
}


class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("button pressed!");
	}
	
}

class ActionEvent {
	public long getWhen() {
		return when;
	}

	public Object getSource() {
		return source;
	}

	long when;
	Object source;
	
	public ActionEvent(long when, Object source) {
		super();
		this.when = when;
		this.source = source;
	}
	
}



