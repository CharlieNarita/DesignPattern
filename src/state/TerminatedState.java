package state;

public class TerminatedState extends MyThreadState{

	private MyThread mt;
	
	public TerminatedState(MyThread mt) {
		this.mt = mt;
	}
	
	@Override
	void move(Action input) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		
	}

}
