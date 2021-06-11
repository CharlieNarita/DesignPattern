package strategy;

import java.util.Comparator;

@FunctionalInterface
public interface AnimalComparator extends Comparator<AbstractAnimal> {
	int compare(AbstractAnimal a1, AbstractAnimal a2);
}
