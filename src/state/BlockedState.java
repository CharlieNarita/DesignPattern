package state;

public class BlockedState extends MyThreadState {
	
	private MyThread mt;
	
	public BlockedState(MyThread mt) {
		this.mt = mt;
	}
	
	@Override
	void move(Action input) {
		// TODO Auto-generated method stub
		if(input.msg == "lockfree") {
			mt.state = new RunningState(mt);
		}
	}

	@Override
	void run() {
		// TODO Auto-generated method stub

	}

}
