package templatemethod;

public class ConcreteHook extends AbstractHook {

	@Override
	public void abstractMethod_1() {
		// TODO Auto-generated method stub
		System.out.println("abstractMethod_1's implementation is being called...");
	}

	@Override
	public void abstractMethod_2() {
		// TODO Auto-generated method stub
		System.out.println("abstractMethod_2's implementation is being called...");
	}

	public void HookMethod_A() {
		System.out.println("HookMethod_A has been overrided");
	}
	
	public boolean HookMethod_B() {
		return false;
	}

}
