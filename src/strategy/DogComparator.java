package strategy;

public interface DogComparator extends AnimalComparator {
	int compare(AbstractAnimal a1, AbstractAnimal a2);
}
