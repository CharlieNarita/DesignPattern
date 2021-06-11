package state;

public class RunningState extends MyThreadState{
	
	private MyThread mt;
	
	public RunningState(MyThread mt) {
		this.mt = mt;
	}
	
	@Override
	void move(Action input) {
		// TODO Auto-generated method stub
		if(input.msg == "stop") {
			mt.state = new TerminatedState(mt);
		}
		if(input.msg == "suspend") {
			mt.state = new ReadyState(mt);
		}
		if(input.msg == "yield") {
			mt.state = new ReadyState(mt);
		}
		
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		
	}

}
