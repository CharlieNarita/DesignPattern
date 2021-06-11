package abstractfactory;

public class Main {
	public static void main(String[] args) {
		AbstractFactory mf = new ModernFactory();
		AbstractFood bread = mf.createFood();
		AbstractVehicle car = mf.createVehicle();
		AbstractWeapon ak = mf.createWeapon();
		
		bread.printName();
		bread.yummy();
		
		car.printName();
		car.move();
		
		ak.printName();
		ak.shoot();
	}
}
