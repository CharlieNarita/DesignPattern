package state;

public class ReadyState extends MyThreadState {
	
	private MyThread mt;
	
	public ReadyState(MyThread mt) {
		this.mt = mt;
	}
	
	@Override
	void move(Action input) {
		// TODO Auto-generated method stub
		if(input.msg == "execute") {
			mt.state = new RunningState(mt);
		}
		if(input.msg == "sleep") {
			mt.state = new TimedWaitingState(mt);
		}
		if(input.msg == "wait") {
			mt.state = new WaitingState(mt);
		}
		if(input.msg == "synchronized") {
			mt.state = new BlockedState(mt);
		}
	}

	@Override
	void run() {
		// TODO Auto-generated method stub

	}

}
