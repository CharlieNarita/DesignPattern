package strategy;

public interface CatComparator extends AnimalComparator {
	int compare(AbstractAnimal a1, AbstractAnimal a2);
}
