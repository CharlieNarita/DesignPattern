package state;

public class NewState extends MyThreadState {
	private MyThread mt;
	
	public NewState(MyThread mt) {
		this.mt = mt;
	}

	@Override
	void move(Action input) {
		// TODO Auto-generated method stub
		if(input.msg == "start") {
			mt.state = new RunningState(mt);
		}
		if(input.msg == "stop") {
			mt.state = new TerminatedState(mt);
		}
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		
	}
	
	
}


