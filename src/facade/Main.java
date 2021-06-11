package facade;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facade facade = new Facade();
		
		User user = new User();
		
		user.method(facade);
		
	}
}
