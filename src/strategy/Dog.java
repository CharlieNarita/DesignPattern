package strategy;

public class Dog extends AbstractAnimal {

	@Override
	public String toString() {
		return "Dog [height=" + height + ", id=" + id + ", name=" + name + "]";
	}

	public int height;
	
	public Dog(int id, String name, int height) {
		super(id, name);
		// TODO Auto-generated constructor stub
		this.height = height;
	}

}
