package templatemethod;

public abstract class AbstractHook {
	public void TemplateMethod() {
		abstractMethod_1();
		HookMethod_A();
		if(HookMethod_B()) {
			SpecificMethod();
		}
		abstractMethod_2();
	}
	
	public void SpecificMethod() {
		System.out.println("AbstractHook's SpecificMethod is being called");
	}
	
	//hook a
	public void HookMethod_A() {
		
	}
	
	//hook b
	public boolean HookMethod_B() {
		return true;
	}
	
	//abstract method 1
	public abstract void abstractMethod_1();
	
	//abstract method 2
	public abstract void abstractMethod_2();
	
}
