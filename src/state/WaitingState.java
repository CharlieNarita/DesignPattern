package state;

public class WaitingState extends MyThreadState {
	
	private MyThread mt;
	
	public WaitingState(MyThread mt) {
		this.mt = mt;
	}
	
	@Override
	void move(Action input) {
		// TODO Auto-generated method stub
		if(input.msg == "notify") {
			mt.state = new RunningState(mt);
		}
	}

	@Override
	void run() {
		// TODO Auto-generated method stub

	}

}
