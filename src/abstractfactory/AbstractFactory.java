package abstractfactory;

public abstract class AbstractFactory {
	abstract AbstractFood createFood();
	abstract AbstractVehicle createVehicle();
	abstract AbstractWeapon createWeapon();
}
