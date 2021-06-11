package prototype;

public class PrototypeTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Realizetype obj1 = new Realizetype();
		Realizetype obj2 = (Realizetype)obj1.clone();
		
		System.out.println("obj1 " + (obj1 == obj2 ? "==" : "!=") + " obj2");
	}

}

class Realizetype implements Cloneable {
	Realizetype() {
		System.out.println("realize class has been created successful");
	}
	
	public Object clone() throws CloneNotSupportedException {
		System.out.println("realize prototype been copied successful");
		return (Realizetype)super.clone();
	}
}
