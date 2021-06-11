package abstractfactory;

public class ModernFactory extends AbstractFactory {

	@Override
	AbstractFood createFood() {
		// TODO Auto-generated method stub
		return new Bread();
	}

	@Override
	AbstractVehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Car();
	}

	@Override
	AbstractWeapon createWeapon() {
		// TODO Auto-generated method stub
		return new AK();
	}

}
