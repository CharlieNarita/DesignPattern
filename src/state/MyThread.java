package state;

public class MyThread {
	MyThreadState state;
	
	void move(Action input) {
		state.move(input);
	}
	
	void run() {
		state.run();
	}
}
