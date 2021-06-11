package facade;

public class Facade {
	private SubSystem1 s1 = new SubSystem1();
	private SubSystem2 s2 = new SubSystem2();
	private SubSystem3 s3 = new SubSystem3();
	
	public void method() {
		s1.method();
		s2.method();
		s3.method();
	}
}
