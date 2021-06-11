package strategy;

public class Cat extends AbstractAnimal{
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int weight;
	
	@Override
	public String toString() {
		return "Cat [id=" + id + ", name=" + name + ", weight=" + weight + "]";
	}

	Cat(int id, String name, int weight) {
		super(id, name);
		this.weight = weight;
	}
	
}
