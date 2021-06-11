package abstractfactory;

public class Bread extends AbstractFood {

	@Override
	void yummy() {
		// TODO Auto-generated method stub
		System.out.println("Bread is delicious...");
	}

	@Override
	void printName() {
		// TODO Auto-generated method stub
		System.out.println("Bread");
	}

}
