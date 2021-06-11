package state;

public class TimedWaitingState extends MyThreadState {
	
	private MyThread mt;
	
	public TimedWaitingState(MyThread mt) {
		this.mt = mt;
	}
	
	@Override
	void move(Action input) {
		// TODO Auto-generated method stub
		if(input.msg == "timeover") {
			mt.state = new RunningState(mt);
		}
	}

	@Override
	void run() {
		// TODO Auto-generated method stub

	}

}
